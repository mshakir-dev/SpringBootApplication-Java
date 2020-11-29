### Spring Boot Application

``` SpringApplication.run(CourseApiApp.class, args); ```
It is a Static Method and It performs multiple operation in Spring Boot Application.
It sets up the default configuration and Starts spring application context. It performs class path scan and Starts the tomcat server [ Initializing Servlet 'dispatcherServlet' ].

@RequestMapping
The ``` @RequestMapping ``` maps only to the GET method by default. To map other HTTP methods. We will have to specify it in the annotation.

Starter for building web, including RESTful, applications using Spring MVC. Uses Tomcat as the default embedded container