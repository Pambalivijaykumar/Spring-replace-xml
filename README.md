Spring Container Flow (Story Explanation)

Think of Spring as a smart factory manager that creates and manages objects for you.

1. Container starts
ApplicationContext container =
    new AnnotationConfigApplicationContext(Config.class);

This tells Spring to start the container (factory) and use the Config class for instructions.

2. Spring reads configuration
@Configuration
@ComponentScan(basePackages = "com")
@PropertySource("classpath:application.properties")

Spring understands three things:

@ComponentScan("com")
Scan the com package and find classes marked with @Component.
@PropertySource
Load values from application.properties.
@Configuration
Marks this class as a configuration setup.
3. Spring finds and creates beans

Spring scans the package and finds:

User class
Address class

Both are marked with @Component, so Spring creates objects (beans) for them.

4. Inject values from properties

From application.properties:

name=vijay
id=23
village=Mumbai
zipCode=123456

Spring injects values:

In Address:

@Value("${village}") → Mumbai
@Value("${zipCode}") → 123456

In User:

@Value("${name}") → vijay
@Value("${id}") → 23
5. Dependency Injection

In User class:

@Autowired
Address address;

Spring sees that User needs an Address object.

Since it already created an Address bean, it injects it into User.

6. Final object structure
User
 ├── name = vijay
 ├── id = 23
 └── address
       ├── village = Mumbai
       └── zipCode = 123456
7. Beans are stored in container

Spring container stores:

"user" → User object
"address" → Address object
8. Getting the bean
User user1 = container.getBean("user", User.class);

You request the User object, and Spring returns a fully initialized object.

9. Closing container
((AbstractApplicationContext) container).close();

Spring container shuts down.

Complete Flow Summary
Start container
→ Read configuration
→ Scan components
→ Create Address bean
→ Inject values into Address
→ Create User bean
→ Inject values into User
→ Inject Address into User
→ Store beans in container
→ Return bean when requested
Key Concept

Without Spring:

You manually create and connect objects

With Spring:

Spring creates objects and injects dependencies automatically

This is called Inversion of Control (IoC).
