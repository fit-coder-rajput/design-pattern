The Proxy Design Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. It involves creating a proxy class that represents the functionality of the original class, adding an extra level of control before accessing the actual object.

Motivation:
The primary motivation behind the Proxy Pattern is to provide controlled access to another object. The proxy can add additional behavior, such as lazy initialization, access control, logging, or caching, before forwarding the request to the real object.

Problem it Solves:
There are situations where direct access to an object is either expensive or needs to be controlled. Some common scenarios where the Proxy Pattern is useful include:

Remote objects (providing local access to a remote resource).
Expensive objects (deferring object creation until it's really needed, known as lazy initialization).
Security control (controlling access based on permissions).
Logging or monitoring (tracking access to the real object).

Analogy:
Think of a proxy like a security guard for a building. The security guard (proxy) controls access to the building (the real object). When you want to enter the building, you go through the security guard first, who might check your identity or log your entry.

Types of Proxy Patterns:
Virtual Proxy: Controls access to a resource that is expensive to create. The proxy creates the object only when it's actually needed (lazy initialization).

Remote Proxy: Provides a local representative for an object that lives in a different address space (e.g., on a different machine in distributed systems).

Protection Proxy: Controls access to the real object based on access rights (security-related use cases).

Smart Proxy: Provides additional functionality, such as logging or reference counting, before forwarding requests to the real object.

Structure of the Proxy Pattern:
Subject: This is the common interface between the real object and the proxy. The proxy and the real object both implement this interface.
RealSubject: This is the actual object that the proxy represents. The proxy controls access to this object.
Proxy: The proxy class implements the same interface as the real object and controls access to the real object. It may add extra behavior (e.g., lazy initialization, access control, logging) before delegating the request to the RealSubject.
UML Diagram:
text
Copy code
+----------------+          +----------------+          +----------------+
|    Client      |  ---->   |    Proxy       |  ---->   |   RealSubject  |
+----------------+          +----------------+          +----------------+
                                   ^                            ^
                                   |                            |
                         +----------------+            +----------------+
                         |    Subject     |            |   Real Logic   |
                         +----------------+            +----------------+

Example: Virtual Proxy (Lazy Initialization)
Let's say we have a large, high-resolution image that is expensive to load. Instead of loading the image right away, we use a proxy to load it only when necessary.

Subject (Interface): The Image interface is the common interface between the real object (HighResolutionImage) and the proxy (ImageProxy).

interface Image {
    void display();
}
RealSubject (The Real Object): This is the actual image class that takes time to load.

class HighResolutionImage implements Image {
    private String fileName;

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();  // Simulate expensive operation
    }

    private void loadImageFromDisk() {
        System.out.println("Loading high-resolution image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
Proxy (The Proxy Object): The proxy class controls access to the real image object. It only loads the image when display() is called, implementing lazy initialization.

class ImageProxy implements Image {
    private HighResolutionImage realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResolutionImage(fileName);  // Load image when needed
        }
        realImage.display();
    }
}
Client: The client interacts with the proxy, not knowing whether it’s dealing with the real object or a proxy. The proxy controls when the real object is created.

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ImageProxy("high_resolution_image.jpg");

        // The image is not loaded yet (lazy initialization).
        System.out.println("Image created. Not loaded yet.");

        // The image will be loaded and displayed now.
        image.display();
        
        // Subsequent calls won't reload the image, as it's already loaded.
        image.display();
    }
}


How the Proxy Works:
Initially, when the ImageProxy is created, the real image (HighResolutionImage) is not loaded yet.
When the display() method is called for the first time, the proxy loads the real image.
On subsequent calls to display(), the proxy uses the already-loaded image without reloading it.
Different Types of Proxy Examples:
Virtual Proxy (Lazy Initialization):

As seen in the above example, the real object is created only when needed. This is useful for resource-intensive objects that are not always required immediately.
Protection Proxy (Access Control):

In this example, the proxy controls access based on user permissions.

class FileAccessProxy implements FileAccess {
    private RealFileAccess realFileAccess;
    private String userRole;

    public FileAccessProxy(String userRole) {
        this.userRole = userRole;
        realFileAccess = new RealFileAccess();
    }

    @Override
    public void readFile() {
        if ("ADMIN".equals(userRole)) {
            realFileAccess.readFile();
        } else {
            System.out.println("Access denied. Only ADMIN can read the file.");
        }
    }
}
Remote Proxy (Distributed Systems):

Imagine an application where the real object resides on a remote server. The proxy represents that remote object locally, and all calls are forwarded to the remote object over the network.
Smart Proxy (Additional Functionality):

This proxy adds extra behavior, such as logging or reference counting, before delegating to the real object.

class SmartProxy implements FileAccess {
    private RealFileAccess realFileAccess;
    private int accessCount = 0;

    public SmartProxy() {
        realFileAccess = new RealFileAccess();
    }

    @Override
    public void readFile() {
        accessCount++;
        System.out.println("File accessed " + accessCount + " times.");
        realFileAccess.readFile();
    }
}
Advantages of the Proxy Pattern:
Control Access: The proxy controls access to the real object, providing additional functionality such as security checks, logging, or lazy initialization.

Reduce System Overhead: In the case of a virtual proxy, expensive objects are only created when absolutely necessary, reducing memory and CPU usage.

Enhance Flexibility: The proxy pattern adds flexibility by allowing extra behavior (e.g., logging, performance monitoring) without modifying the real object.

Network Transparency: Remote proxies make it easy to work with remote objects as if they were local, without the client needing to know about the networking details.

When to Use the Proxy Pattern:
When creating objects is expensive and you want to delay the creation until necessary (lazy initialization).
When you need to control access to an object based on certain conditions (protection proxy).
When you need to add logging, monitoring, or reference counting before accessing the real object (smart proxy).
When working with remote objects and want to represent them locally to avoid network complexity (remote proxy).
Real-World Examples of Proxy Pattern:
Java RMI (Remote Method Invocation): Uses remote proxies to communicate with objects on different machines.
Virtual Memory: The operating system uses a proxy to manage memory pages, loading them into RAM only when needed.
Database Connections: A connection pool can act as a proxy, managing access to real database connections and controlling resource usage.
Internet Proxy Servers: These servers act as intermediaries between clients and external services, often adding caching or filtering functionality.