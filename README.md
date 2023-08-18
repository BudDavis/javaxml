# javaxml

mvn exec:java -Dexec.mainClass=uta.cse3310.javaxmlexample.App




java -cp ./target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App 



change to java 11 in pom.xml


add these to the pom.xml

<!-- JAXB API only -->
  <dependency>
      <groupId>jakarta.xml.bind</groupId>
      <artifactId>jakarta.xml.bind-api</artifactId>
      <version>3.0.0</version>
  </dependency>

  <!-- JAXB RI, Jakarta XML Binding -->
  <dependency>
      <groupId>com.sun.xml.bind</groupId>
      <artifactId>jaxb-impl</artifactId>
      <version>3.0.0</version>
      <scope>runtime</scope>
  </dependency>

 xjc -d src -p com.mycompany.app ../JSBSim.xsd

 seems jaxb is now an "eclipse project"..

https://eclipse-ee4j.github.io/jaxb-ri/4.0.1/docs/ch01.html#jaxb-2-0-sample-apps

from the web

https://mkyong.com/java/jaxb-hello-world-example/#jaxb-hello-world-example

