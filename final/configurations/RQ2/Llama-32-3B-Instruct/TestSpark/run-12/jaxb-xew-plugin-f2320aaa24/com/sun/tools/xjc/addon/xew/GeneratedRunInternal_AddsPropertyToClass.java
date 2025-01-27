package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedRunInternal_AddsPropertyToClass {

    @Test
    public void runInternal_AddsPropertyToClass() throws ClassNotFoundException, IOException {
        Class<?> clazzMock = mock(Class.class);
        when(clazzMock.getName()).thenReturn("MyClass");
        Object result = XmlElementWrapperPlugin.runInternal(clazzMock);
        assertTrue(result instanceof String);
        assertEquals("MyClass", result);
    }

}

public class XmlElementWrapperPlugin {

    public static boolean runInternal(Outline outline) throws ClassNotFoundException, IOException {
        // implementation
        return false;
    }

}