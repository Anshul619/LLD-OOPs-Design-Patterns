# SOLID Principles

![](https://www.dereuromark.de/wp-content/uploads/2016/01/SOLID.jpg)

# Details 

| Principle                                          | Description                                                                                                                                                                                                                                                                                                                      |
|----------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| S - Single Responsibility Principle (known as SRP) | The name itself suggest that the class/method should be having one and only one responsibility.<br/>- Code should be [highly cohesive](Cohesion.md). (loosely coupled)                                                                                                                                                           |
| O — Open/Closed Principle                          | This principle suggests that classes should be open for extension but closed for modification.<br/>- What is means is that if the class A is written by the developer AA, and if the developer BB wants some modification on that then developer BB should be easily do that by extending class A, but not by modifying class A. |
| L - Liskov’s Substitution Principle                | This principle suggests that parent classes should be easily substituted with their child classes without blowing up the application.                                                                                                                                                                                            |
| I - Interface Segregation Principle                | This principle suggests that many client specific interfaces are better than one general interface.<br/>- This is the first principle which is applied on interface, all the above three principles applies on classes.                                                                                                          |
| D - Dependency Inversion Principle                 | This principle suggests that classes should depend on abstraction but not on concretion.<br/>- What does it mean that we should be having an object of interface which helps us to communicate with the concrete classes.                                                                                                        |

# Other links 
- [SOLID in Go](https://github.com/Anshul619/golang/tree/main/OOPsGo)

# References
- [SOLID Principles — explained with examples](https://medium.com/mindorks/solid-principles-explained-with-examples-79d1ce114ace)
- [Software Engineering SOLID Principles](https://junaidshahid.com/software-engineering-solid-principles/)
- [SOLID Principles — Simplified with Illustrations](https://levelup.gitconnected.com/solid-principles-simplified-with-illustrations-fe5265f68ec6)
- [Coding with Clarity](https://alistapart.com/article/coding-with-clarity/)