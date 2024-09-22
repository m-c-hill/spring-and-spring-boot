# spring-and-spring-boot
Learning Spring &amp; Spring Boot, following in28minutes's course


## Section 1: Spring

### 1.1 Creating a new Spring project

* Use Spring Initializr to create a new Spring project: https://start.spring.io/
* For the projects in the repo, Maven is used as the build tool.

### 1.2 Tightly Coupled vs Loosely Coupled

* Coupling is a measure of how much change is required when making a code change.
* Tightly Coupled: When a class is dependent on another class, it is said to be tightly coupled.
* Loosely Coupled: When a class is not dependent on another class, it is said to be loosely coupled.

### 1.3 Wiring and Dependency Injection

In Java, "wiring" generally refers to connecting different components or objects together in an application, typically in the context of dependency injection (DI). Wiring ensures that objects that depend on other objects have their dependencies provided, instead of being created or managed manually.

Wiring makes code more modular and easier to maintain since objects don't have to manage their own dependencies.

#### Autowiring vs Manual Wiring

* Autowiring: In Spring, you can automatically wire (inject) a dependency into a class by using annotations like `@Autowired`. The framework scans and identifies the necessary beans and injects them automatically.
* Manual Wiring: You can also configure dependencies manually, either in configuration files (like `applicationContext.xml`) or using Java-based configuration (`@Configuration`, `@Bean` annotations).


### 1.4 Java Beans and Spring Beans

In Java, a bean is a reusable software component that can be manipulated visually in a builder tool. Beans are typically Java classes that follow certain conventions, such as having a no-argument constructor, providing getter and setter methods, and being serializable. Classically, an EJB (Enterprise Java Bean) is an example of a Java bean:

```java
// Example of an EJB
class JavaBean implements Serializable {
    private String property;

    public JavaBean() {
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}

```

A Java bean must:
* Have a no-argument constructor.
* Provide getter and setter methods for accessing its properties.
* Implement the `Serializable` interface.

A Spring Bean is a Java object that is instantiated, assembled, and managed by the Spring IoC container. Spring beans are typically Java objects that are created and managed by the Spring container. Spring beans can be configured using XML files, annotations, or Java-based configuration.

Finally, a POJO is a Plain Old Java Object that is not bound by any restriction other than those forced by the Java language. A POJO can be a Java bean, but not all Java beans are POJOs.

### 1.5 Spring Configuration

Spring configuration is the process of configuring Spring beans and their dependencies. Spring configuration can be done in multiple ways:

1. XML-based configuration: Using XML files like `applicationContext.xml` to define beans and their dependencies.
2. Annotation-based configuration: Using annotations like `@Component`, `@Service`, `@Repository`, `@Autowired`, etc., to define beans and their dependencies.
3. Java-based configuration: Using Java classes annotated with `@Configuration` and `@Bean` annotations to define beans and their dependencies.

### 1.6 Spring Container

A Spring container (also known as the context) is the core of the Spring Framework. It manages the lifecycle of Spring beans and their dependencies. The Spring container is responsible for instantiating, configuring, and assembling beans. There are two types of Spring containers:
* Bean Factory: The simplest container that provides basic support for DI and lifecycle management.
* Application Context: A more advanced container that builds on top of the BeanFactory and provides additional features like event propagation, message resource handling, etc.

Application contexts are generally preferred over bean factories for most applications, and are recommended for web applications, web services, REST APIs and microservices.

To get a list of the beans in the Spring container, you can use the `getBeanDefinitionNames()` method of the `ApplicationContext` interface:

```java
ApplicationContext context = SpringApplication.run(MySpringApplication.class, args);
String[] beanNames = context.getBeanDefinitionNames();
```
