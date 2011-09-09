Java Webapp Archetype
====================

A maven archetype to create a RESTful Jersey/Guice/Jackson/Metrics/etc web app.

To install
-----------

        $ mvn install
  
To use
-------

1. Create project from archetype

          $ mvn archetype:generate -DarchetypeGroupId=com.shanealmanek -DarchetypeArtifactId=java-webapp-archetype -DarchetypeVersion=1.0
  
2. Start the server

         $ mvn tomcat:run
  
3. Check it works

         $  curl "http://localhost:8080/${artifactId}"
         (where ${artifactId} is the artifact id you specified in the interative generation)