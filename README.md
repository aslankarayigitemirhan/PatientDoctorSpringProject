*I create a Spring project to understand how Spring Web project works step by step.*

- Firstly, I have designed the UML Diagram of base classes that play an crucial role in my project. After that, I implemented step by step:
  * Prescription
  * Patient
  * Doctor
  * Hospital Management

- I have created a class whose design strategy is based on @Configuration annotation. After this class is used in my project as a @Bean annotation, Spring container design understand that this class(HospitalConfiguration.java) were used as a database
- After data is supplied to spring web project, class that has a @Repository annotation is created.
- Following these order: @Repository --> @Services --> @Controller -->Client Part is used.
- Each transfer has a @AutoWired annotation to supply dependency injection.(DI) principle.
- Finally, you can provide Postman Application to send a request, which is basically designed in @Controller class...


For my next project, which will also be consisted of PostgreSQL Database Application, please keep on my following projects...

Best Regards

***Emirhan ASLANKARAYIGIT***
