spring-mvc-template
===================

This is a basic Java web application template structure for easily bootstrapping web development projects. This template uses the following foundational technologies:

* `Gradle` for build system
* `Spring MVC` framework with `@MVC` annotations
* `JSTL` with `Apache Tiles` view templating framework
* `Spring Security` framework with basic `Apereo CAS` provider configured out of the box
* `Twitter Bootstrap` CSS framework
* `Logback` framework for logging

### Configuration

This app's config assumes that you have an Apereo CAS server running somewhere. 

* Clone the repo, cd into the root of the project and copy files from `etc` directory (`cas.properties`, `logback.xml`) to `/etc/templateapp` directory

* Set appropriate values for your CAS server in `/etc/templateapp/cas.properties`

* Build by running `./gradlew` (or `gradlew.bat` if on Windows). The resulting war file is then available for deployment in `build/libs`

### Adopt for your project development

* Clone the repo, cd into the root of project and delete the git repository e.g. `rm -rf .git` (so that you could create your own)
* Modify project name in `settings.gradle`
* Modify group, description, version, etc. properties in the `build.gradle`. Also adjust the dependecies appropriate to your project
* Change `contextName` in `etc/logback.xml` appropreate for your app
* Change refernces to the config directory (currently `/etc/templateapp`) appropriate for your project. These references are in the following files: (`WEB-INF/spring/root-context.xml`, `src/main/resources/logback.xml`)
* Change `context-component-scan base-package` as appropriate for your app in `WEB-INF/dispatcher-servlet.xml`
* And of course change/add java packages, add classes and add/change views as appropreate for your app, etc.

Happy hacking!




