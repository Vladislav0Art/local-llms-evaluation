package com.sun.tools.xjc.addon.xew;

public class GeneratedTestRunInternal_AddsPropertyToClass {

    public static boolean runInternal(Outline outline) throws ClassNotFoundException, IOException {
        // implementation
        return false;
    }

    @Test
    public void testRunInternal_AddsPropertyToClass() throws ClassNotFoundException, IOException {
        Class<?> clazzMock = mock(Class.class);
        when(clazzMock.getName()).thenReturn("MyClass");
        assertEquals("MyClass", runInternal(clazzMock));
    }
}

class Outline implements Visitor {

    @Override
    public void visitElement(OutlineVisitor visitor) {
    }

    @Override
    public void visitAttribute(OutlineVisitor visitor) {
    }
}

class OutlineVisitor implements Visitor {
    // implement the Visitor interface methods here
}

class ClassMock {
    public String getName() throws Exception {
        return "MyClass";
    }

}