# SimpleFormsApp_SpringMVC
Per Scholas project - Spring MVC - creating a simple form web app

1. can be found in SpringMVC_Exercise_EnhanceProjects
2. can be found in SpringMVC_Exercise_EnhanceProjects
3. can be found in SpringMVC_Exercise_EnhanceProjects

4. Create a Spring MVC application called SimpleFormsApp_SpringMVC
    - Include the Maven dependency for org.eclipse.persistence.jpa
    - Create a package to contain controller classes
    - Create the folder “views” inside “WebContent/WEB-INF”
    - Create two JSPs inside the “views” folder:
        - login_form.jsp
        - login_success.jsp
    - Create a class in the controllers package and name it “UserController”
        - Annotate the class with @Controller
    - Dispatcher Servlet - The following statements refer to setting up the dispatcher servlet using the "web.xml" and "dispatcher-servlet.xml" files. You may also set it up using Java configuration.
        - Open the “web.xml” file and create a dispatcher servlet with the url pattern set to “/”
        - Create the file “dispatcher-servlet.xml” file inside the “WEB-INF” folder
            - configure the bean for InternalResourceViewResolver
    - Create a method in the controller to handle a GET request to display the “login-form.jsp” file in the browser
    - Test that the application will launch without errors and display the “login-form.jsp” page with the correct URL
    - Create a form in the “login_form.jsp” file to input and submit email and password
    - Create a method in the controller to receive a post request and print out the email and password entered in the browser in the console
5. Continue with the previous project SimpleFormsApp_SpringMVC
    - Configure the login method in the controller to assign the email to the model
    - Have the page “login_success.jsp” display a welcome message to the user (e.g., “Welcome john@doe.com”)
6. Continue with the previous project SimpleFormsApp_SpringMVC
    - Add the Maven dependency for EclipseLink JPA (org.eclipse.persistence.jpa) or Spring Data JPA
    - Add the Maven dependency to connect to a database (e.g., mariadb-java-client)
    - Create the file “persistence.xml” in the META-INF folder (alternatively, you may add JPA to the project facets using the preferences panel)
        - configure the “persistence.xml” file with a unit name, classes, and properties to match the database
    - Create a package to contain models
    - Create a User class in the models package and include the following fields:
        - userId
        - firstName
        - lastName
        - email
        - password
    - Create a package to contain repositories
        - create a repository for the User class
        - create a method to find a User by email
    - Create a package to contain service interfaces and and another to contain the implementations
    - Create the UserService interface inside the interface package
        - create a method to find a User by email through the appropriate repository (e.g. UserRepository)
    - Create the UserService implementation in the relevant package
    - Write logic in the controller to compare the entered password with the password retrieved from the database to allow a user to proceed to the success page or return to the login page with an error message
    - Configure the “login_form.jsp” page to display the error message if not null
    - Configure the “login_success.jsp” page to display a welcome message with the user’s first name