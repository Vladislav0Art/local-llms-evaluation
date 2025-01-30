package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class GeneratedInternalKeyTest {

    @Test
    public void internalKeyTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String initialKey = "testKey";
        String key = (String) invokePrivateMethod(new Attributes(), "internalKey", new Class[]{String.class}, new Object[]{initialKey});
        assertTrue(key.charAt(0) == '/');
    }

}