# Intellij Idea 2018.2 unit tests with java 9 modules

This example demonstrates, that **Intellij Idea** has problems running unit tests,
which use java 9 module system.

To see that, you can just run ApplicationTest, which fails, because
ServiceLoader is not able to find implementations for SoftwareProduct inteface,
even though com.demo.library module provides one.

If you run the test with maven it passes. Also, if you run Application.main,
which uses the same code as ApplicationTest everything works as expected.

##Formal steps to reproduce
1. File -> New -> Project From Existing Sources
2. Find root pom.xml from this project and import it
4. When Idea asks you which JKD to use - give it JDK 10
3. Run ApplicationTest
4. See it fail

