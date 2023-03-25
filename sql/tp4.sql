-- Q1

-- Algebrique
SELECT n.moy_test, n.code
FROM etudiant e
JOIN notation n
ON e.num_et = n.num_et
WHERE e.prenom_et = 'STEPHANE' and e.nom_et = 'ROCCHI'
ORDER BY n.moy_test DESC;

-- Predicative
SELECT moy_test, code
FROM notation n, etudiant e
WHERE e.num_et = n.num_et and e.nom_et = 'ROCCHI' and e.prenom_et = 'STEPHANE'
ORDER BY moy_test DESC;

-- Imbrique
SELECT moy_test, code
FROM notation 
WHERE num_et IN (SELECT num_et from etudiant
                WHERE nom_et = 'ROCCHI' and prenom_et = 'STEPHANE');

-- Q2

-- Algebrique
SELECT DISTINCT m.code, m.libelle 
FROM module m

JOIN enseignt e ON m.code = e.code
JOIN prof p ON e.num_prof = p.num_prof

WHERE p.nom_prof = 'BOITARD' and p.prenom_prof = 'DIDIER';

-- Predicative
SELECT DISTINCT m.code, libelle
FROM module m, enseignt e, prof p

WHERE m.code = e.code 
and p.num_prof = e.num_prof
and nom_prof = 'BOITARD' 
and prenom_prof = 'DIDIER';

-- Imbrique
SELECT DISTINCT code, libelle
FROM module
WHERE code in (SELECT code
               FROM enseignt
               WHERE num_prof IN (SELECT num_prof
                                  FROM prof
                                  WHERE nom_prof = 'BOITARD' and prenom_prof = 'DIDIER'));

-- Q3

-- Algebrique
SELECT DISTINCT e.groupe
FROM etudiant e
JOIN enseignt en
ON e.num_et = en.num_et
JOIN prof p
ON en.num_prof = p.num_prof
WHERE p.nom_prof = 'LAPORTE' and annee = 2;

-- Predicative

SELECT DISTINCT e.groupe
FROM etudiant e, enseignt en, prof p
WHERE e.num_et = en.num_et and en.num_prof = p.num_prof
and p.nom_prof = 'LAPORTE' and annee = 2;

-- Imbrique

SELECT DISTINCT groupe
FROM etudiant
WHERE num_et IN (SELECT num_et
                 FROM enseignt
                 WHERE num_prof IN (SELECT num_prof
                                    FROM prof
                                    WHERE nom_prof = 'LAPORTE' and prenom_prof = 'MARC')) and annee = 2;

-- Q4

-- Algebrique
SELECT DISTINCT e.nom_et
FROM etudiant e
JOIN enseignt en
ON e.num_et = en.num_et
JOIN module m
on en.code = m.code
ORDER BY e.nom_et ASC;

-- Predicative

SELECT DISTINCT e.nom_et
FROM etudiant e, enseignt en, module m
WHERE e.num_et = en.num_et and en.code = m.code
ORDER BY e.nom_et ASC;

-- Imbrique

SELECT DISTINCT nom_et
FROM etudiant
WHERE num_et IN (SELECT num_et
                 FROM enseignt
                 WHERE code IN (SELECT code
                                FROM module)) ORDER BY nom_et ASC;
                                
-- Q5

-- Algebrique

SELECT distinct et.nom_et, et.num_et 
FROM etudiant et 
JOIN enseignt en on en.num_et = et.num_et
JOIN prof p on en.code = p.mat_spec
ORDER BY et.nom_et ASC;

-- Predicative

SELECT DISTINCT et.nom_et, et.num_et 
FROM etudiant et, enseignt en, prof p
WHERE en.num_et = et.num_et AND en.code = p.mat_spec
ORDER BY et.nom_et ASC;

-- Imbrique

SELECT nom_et, num_et 
FROM etudiant
WHERE num_et IN (SELECT num_et 
                 FROM enseignt
                 WHERE code IN (SELECT mat_spec 
                                FROM prof)) ORDER BY nom_et ASC;

-- Q6

SELECT COUNT(p.num_prof)
FROM prof p;

-- Q7

SELECT AVG(n.moy_cc)
FROM notation n
WHERE code = 'PRL';

-- Q8

SELECT COUNT(p.num_prof)
FROM prof p
JOIN enseignt e
ON p.num_prof = e.num_prof
JOIN etudiant et
ON e.num_et = et.num_et
WHERE et.nom_et = 'LYON' and et.prenom_et = 'PHILIPPE';

-- Q9

SELECT AVG((moy_test * coeff_test + moy_cc * coeff_cc) / (coeff_test + coeff_cc))
FROM module m, notation n
WHERE m.code = n.code and m.libelle = 'PROLOG';

-- Q10

SELECT MIN(coeff_test)
FROM module;

--Q11

SELECT m.libelle
FROM module m
WHERE coeff_test IN (SELECT MIN(coeff_test)
                     FROM module);
                     
-- Q12

SELECT AVG((moy_test * coeff_test + moy_cc * coeff_cc) / (coeff_test + coeff_cc)) 
FROM module m, notation n 
JOIN etudiant e 
ON n.num_et = e.num_et
WHERE nom_et = 'LEVY' AND prenom_et = 'SANDRINE';

-- Q13

SELECT LIBELLE FROM MODULE m
JOIN NOTATION n ON m.CODE = n.CODE
WHERE n.MOY_TEST = (SELECT MAX(MOY_TEST) FROM NOTATION);

-- Q14

SELECT nom_et
FROM etudiant e
JOIN notation n on n.num_et = e.num_et
WHERE moy_test = (SELECT MAX(moy_test)
                  FROM notation);
                  
-- Q15

SELECT VILLE_ET FROM ETUDIANT
UNION
SELECT VILLE_PROF FROM PROF;

/*q16*/
select num_prof, code from enseignt
INTERSECT
select resp, code from module;

/*Q17*/

SELECT LIBELLE FROM MODULE
MINUS
SELECT MAT_SPEC FROM PROF;

/*Q18*/

SELECT RESP,CODE
FROM MODULE
WHERE RESP IS NOT NULL;

/*Q19*/

SELECT LIBELLE
FROM MODULE
WHERE RESP IS NULL;

/*Q20*/

SELECT DISTINCT NOM_ET, PRENOM_ET
FROM ETUDIANT ET
JOIN NOTATION N ON N.NUM_ET = ET.NUM_ET
WHERE MOY_TEST IS NULL;

/*Q21*/

SELECT DISTINCT NOM_ET, PRENOM_ET
FROM ETUDIANT ET
JOIN ENSEIGNT EN ON EN.NUM_ET = ET.NUM_ET
JOIN PROF P ON P.NUM_PROF = EN.NUM_PROF
WHERE NOM_PROF != 'LAPORTE' AND PRENOM_PROF != 'MARC';

/*Q22*/

SELECT NOM_PROF, PRENOM_PROF FROM PROF P
WHERE NUM_PROF NOT IN (SELECT RESP FROM MODULE WHERE RESP IS NOT NULL);


/*Q23*/

SELECT COUNT(NOM_ET) FROM ETUDIANT 
WHERE ANNEE = 2;

/*Q24*/

SELECT MAX(MOY_TEST)
FROM NOTATION
GROUP BY NUM_ET;

/*Q25*/

SELECT ET.NUM_ET, COUNT(NUM_PROF)
FROM ETUDIANT ET
JOIN ENSEIGNT N ON N.NUM_ET = ET.NUM_ET
WHERE ANNEE = 2
GROUP BY ET.NOM_ET, ET.NUM_ET, CODE;

/*Q26*/ 

SELECT COUNT(*)
FROM PROF
GROUP BY VILLE_PROF HAVING COUNT(*) >=5;

