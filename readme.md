# How to build project

Please read ieagle-biz's readme.md

# Initial project

- Eclipse:

```bash
mvn eclipse:clean
mvn eclipse:eclipse
```

- IntelliJ IDEA:

```bash
mvn idea:clean
mvn idea:idea
```

# Install external libraries(if necessary):

* Base library

```bash
mvn install:install-file -DgroupId=inet -DartifactId=com.inet.base -Dversion=2.5.1.RELEASE -Dpackaging=jar -Dfile=lib/com.inet.base-2.5.1.RELEASE.jar
mvn install:install-file -DgroupId=inet -DartifactId=com.inet.web -Dversion=2.5.1.RELEASE -Dpackaging=jar -Dfile=lib/com.inet.web-2.5.1.RELEASE.jar
```

* iNet cloud library:
  mvn install:install-file -DgroupId=inet -DartifactId=cloud-docx -Dversion=5.4.0 -Dpackaging=jar
  -Dfile=lib/cloud-docx-5.4.0.jar mvn install:install-file -DgroupId=inet -DartifactId=icloud-xdb -Dversion=4.4.0
  -Dpackaging=jar -Dfile=lib/icloud-xdb-4.4.0.jar

```bash

```

* JSON lib

```bash
mvn install:install-file -DgroupId=net.sf.json-lib -DartifactId=json-lib -Dversion=2.4 -Dpackaging=jar -Dfile=lib/json-lib-2.4.jar
```

# Build project

```bash
mvn install package
```

# More command for developer

- Build package

```bash
mvn package 
```

- Install package

```bash
mvn install package
```

- Install ignore test

```bash
mvn install -DSkipTest=true
```

