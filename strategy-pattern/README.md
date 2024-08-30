
#definition
The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.


#motivation
Inheritance is typically used to share common behavior among classes. However, when dealing with multiple classes that share only partial behaviors,
inheritance can lead to code duplication, reduced readability, and the inability to change behaviors at runtime. 
The Strategy pattern offers a solution to this problem by allowing different algorithms or behaviors to be selected and used interchangeably at runtime.

#Benifits
By using the Strategy pattern, you can encapsulate different behaviors or algorithms within separate classes, 
allowing them to be selected and applied dynamically at runtime, thereby avoiding code duplication and enhancing 
readability and flexibility.

#Example code is almost self explanatory here clients is independent of the behaviours, behaviours are interchangable,
no code duplication, scalable, and readable.