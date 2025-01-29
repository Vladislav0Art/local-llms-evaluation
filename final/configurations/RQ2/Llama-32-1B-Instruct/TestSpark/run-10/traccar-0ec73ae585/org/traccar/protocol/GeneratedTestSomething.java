package org.traccar.protocol;

public class GeneratedTestSomething {

    // test1

    @Test
    public void testSomething() {
        // This will cause an error because it's protected
        GeneratedClass.TestClass.testGeneratedMethod();
    }
}

class MyGeneratedClass {

    @PublicMethod
    public void myPublicMethod() {
        System.out.println("Hello, World!");
    }

    private void publicMethod() {
        System.out.println("Hello, World!");
    }

}