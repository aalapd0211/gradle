This projects contain basic information about the gradle build tools.
THis project creates to keep backup oof the learning of the gradle.


Command line to create a gradle project.

1> mkdir learn-gradle
2> gradle init
	  One run this command it will ask for various option and we need to keep selecting that option. When we finish we are going to have a new gradle with a basis folder structure.
	  Following it the option I have selected when going through project creation
	  C:\Users\adesai\AALAP-Learning-example\gradle\learn-gradle>gradle init

		Select type of project to generate:
		  1: basic
		  2: application
		  3: library
		  4: Gradle plugin
		Enter selection (default: basic) [1..4] 2

		Select implementation language:
		  1: C++
		  2: Groovy
		  3: Java
		  4: Kotlin
		  5: Swift
		Enter selection (default: Java) [1..5] 3

		Select build script DSL:
		  1: Groovy
		  2: Kotlin
		Enter selection (default: Groovy) [1..2] 2

		Select test framework:
		  1: JUnit 4
		  2: TestNG
		  3: Spock
		  4: JUnit Jupiter
		Enter selection (default: JUnit 4) [1..4] 1

		Project name (default: learn-gradle): learn-gradle
		Source package (default: learn.gradle): aalap..learn.gradle

		> Task :init
		Get more help with your project: https://docs.gradle.org/5.6.1/userguide/tutorial_java_projects.html

		BUILD SUCCESSFUL in 1m 17s
		2 actionable tasks: 2 executed

3> Now you can Import this project in eclipse as an existing gradle project and start working on that




jaxrs-jerssey-gradle : This project han an information about making a sample web-service publisher using the gradle. THis will generate a war file which we need to deploy on the tomcat server. Once we deploy this on tomcat we can check the service by using end point ant get detault html data.
					   Following is the URL to call the endpoin from browser or from the postman.
					   
jaxrs-jerssey-client-gradle : THis project is a sample client which called the publisher and get the data from publisher and show it using the client. We have used various methods to show various type of the data.

		