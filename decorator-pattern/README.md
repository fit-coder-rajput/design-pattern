Decorator Pattern: Motivation and Solution

#Motivation
In object-oriented design, you often encounter situations where you need to add functionality to an object without altering its structure.
 A common approach to this problem is using inheritance, but this can lead to a few issues:

#Class Explosion: 
If you need different combinations of features, inheritance would force you to create a separate subclass for each combination, 
leading to a proliferation of classes.

#Inflexibility: 
Once a class is created with certain features, modifying or removing these features requires changing the class hierarchy or 
creating new subclasses, which is not always practical.

#Tight Coupling: 
Inheritance ties the behavior of the subclass directly to its superclass, making the system rigid and harder to extend or maintain.
Imagine a scenario where you have a basic Coffee class, and you want to add various functionalities like adding milk, sugar, or w
hipped cream. If you used inheritance, you would end up with a large number of subclasses like MilkCoffee, SugarCoffee, MilkSugarCoffee, 
and so on. This quickly becomes unmanageable.

---------------------------------------------------------------------------------------------------------------------------------------------
#Solution with the Decorator Pattern
The Decorator Pattern provides a flexible alternative to subclassing for extending functionality. It allows you to dynamically 
attach additional responsibilities to an object at runtime without modifying the object’s code. Decorators provide a way to add behaviors to individual objects,
without affecting the behavior of other objects from the same class.

#Key Components of the Decorator Pattern:
#Component: The interface or abstract class that defines the basic behavior that can be dynamically extended.

#ConcreteComponent: The class that implements the Component interface. It represents the primary object to which additional responsibilities can be added.

#Decorator: An abstract class that implements the Component interface and contains a reference to a Component object. It delegates the basic operations to 
this object and can add new behavior.

#ConcreteDecorator: Classes that extend the Decorator and add specific behaviors.