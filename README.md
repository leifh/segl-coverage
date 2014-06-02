segl coverage
=============

A project showing the result of different coverage tools with the Scala language (2.11).

scct (sbt)
----------

https://github.com/sqality/scct

    sbt clean scct:test

scoverage (sbt)
---------------

https://github.com/scoverage/scalac-scoverage-plugin
https://github.com/scoverage/sbt-scoverage

    sbt clean scoverage:test
    
jacoco4sbt (sbt)
----------------
    
https://github.com/sbt/jacoco4sbt    

    sbt clean jacoco:cover    
    
jacoco (maven)
--------------
http://www.eclemma.org/jacoco/
    
    mvn -Pjacoco clean package
    
cobertura (maven)
-----------------
http://cobertura.github.io/cobertura/

    mvn -Pcobertura clean site
