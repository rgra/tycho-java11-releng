# tycho-java11-releng

Fixed with https://bugs.eclipse.org/bugs/show_bug.cgi?id=571432

# doc

Set JAVA_HOME to Java >=11

cd repository

mvn clean package

Change <repository location in targett/test.target

cd ..

mvn verify

```
mvn -version
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\ProgramData\chocolatey\lib\maven\apache-maven-3.6.3\bin\..
Java version: 11.0.9.1, vendor: AdoptOpenJDK, runtime: C:\Program Files\AdoptOpenJDK\jdk-11.0.9.101-hotspot
Default locale: de_DE, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```
```
mvn verify
[INFO] Scanning for projects...
[WARNING] No explicit target runtime environment configuration. Build is platform dependent.
[INFO] Computing target platform for MavenProject: de.tycho.test:req-xml:1.0.0-SNAPSHOT @ D:\git\tycho-java11-releng\req-xml\pom.xml
[ERROR] Cannot resolve target definition:
[ERROR]   Software being installed: com.sun.xml.bind.jaxb-osgi 2.3.3.b02
[ERROR]   Missing requirement: com.sun.xml.bind.jaxb-osgi 2.3.3.b02 requires 'java.package; javax.xml.catalog 0.0.0' but it could not be found
[ERROR]
[ERROR] Failed to resolve target definition D:\git\tycho-java11-releng\targett\test.target: See log for details -> [Help 1]
```
