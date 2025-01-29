package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testConvertToDomainMultipleClasses() {
        Domain domain = Domain.class;
        Object[] source = {new ArrayList<>(), new ArrayList<>()};
        String[] target = {"3", "4"};
        try {
            GeneratedTest.testConvertToDomainMultipleClasses(domain, null, source);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testConvertToAnotherDomainMultipleClasses() {
        AnotherDomain domain = AnotherDomain.class;
        Object[] source = {new ArrayList<>(), new ArrayList<>()};
        String[] target = {"3", "4"};
        try {
            GeneratedTest.testConvertToAnotherDomainMultipleClasses(domain, null, source);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testConvertToDomain() {
        Domain domain = Domain.class;
        Object[] source = {new ArrayList<>(), new ArrayList<>()};
        String[] target = {"1", "2"};
        try {
            GeneratedTest.testConvertToDomain(domain, null, source);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testConvertToAnotherDomain() {
        AnotherDomain domain = AnotherDomain.class;
        Object[] source = {new ArrayList<>(), new ArrayList<>()};
        String[] target = {"3", "4"};
        try {
            GeneratedTest.testConvertToAnotherDomain(domain, null, source);
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // expected
        }
    }

    public class Domain {
        public static Class<?> getClass() {
            return Domain.class;
        }
    }

    public class AnotherDomain {
        public static Class<?> getClass() {
            return AnotherDomain.class;
        }
    }

    public void testConvertToDomainMultipleClasses(Class<?> domainClass, String[] source) throws Exception {
        Object[] sourceArray = new Object[source.length];
        for (int i = 0; i < source.length; i++) {
            sourceArray[i] = source[i].equals("1") ? "true" : "false";
        }
        Class<?> clazz = domainClass;
        Object result = GeneratedTest.testConvertToDomain(clazz, null, sourceArray);
        assertEquals(source.length, result.getClass().getDeclaredMethods().length);
    }

    public void testConvertToAnotherDomainMultipleClasses(Class<?> domainClass, String[] source) throws Exception {
        Object[] sourceArray = new Object[source.length];
        for (int i = 0; i < source.length; i++) {
            sourceArray[i] = source[i].equals("1") ? "true" : "false";
        }
        Class<?> clazz = domainClass;
        Object result = GeneratedTest.testConvertToAnotherDomain(clazz, null, sourceArray);
        assertEquals(source.length, result.getClass().getDeclaredMethods().length);
    }

    public void testConvertToDomain(String[] target) throws Exception {
        String[] sources = {"1", "2"};
        Class<?> clazz = Domain.class;
        Object result = GeneratedTest.testConvertToDomain(clazz, null, sources);
        assertEquals(2, result.getClass().getDeclaredMethods().length);
    }

    public void testConvertToAnotherDomain(String[] targets) throws Exception {
        String[] sources = {"3", "4"};
        Class<?> clazz = AnotherDomain.class;
        Object result = GeneratedTest.testConvertToAnotherDomain(clazz, null, sources);
        assertEquals(2, result.getClass().getDeclaredMethods().length);
    }

    public void testArrays() throws Exception {
        Object[] source = {new ArrayList<>(), new ArrayList<>()};
        String[] target = {"1", "2"};
        Class<?> clazz = Domain.class;
        Object[] result = GeneratedTest.testArrays(clazz, null, source, target);
        assertEquals(2, result.length);
    }

    public void testArrays(Object[] sources) throws Exception {
        Object[] sourceArray = new Object[sources.length];
        for (int i = 0; i < sources.length; i++) {
            sourceArray[i] = source[i].equals("1") ? "true" : "false";
        }
        Class<?> clazz = Domain.class;
        Object result = GeneratedTest.testArrays(clazz, null, sourceArray);
        assertEquals(2, result.getClass().getDeclaredMethods().length);
    }

    public static void testConvertToDomainMultipleClasses(Class<?> domainClass, String[] source) throws Exception {
        Object[] sourceArray = new Object[source.length];
        for (int i = 0; i < source.length; i++) {
            sourceArray[i] = source[i].equals("1") ? "true" : "false";
        }
        Class<?> clazz = domainClass;
        GeneratedTest.testConvertToDomain(clazz, null, source);
    }

    public static void testConvertToAnotherDomainMultipleClasses(Class<?> domainClass, String[] source) throws Exception {
        Object[] sourceArray = new Object[source.length];
        for (int i = 0; i < source.length; i++) {
            sourceArray[i] = source[i].equals("1") ? "true" : "false";
        }
        Class<?> clazz = domainClass;
        GeneratedTest.testConvertToAnotherDomain(clazz, null, source);
    }

    public static void testConvertToDomain(String[] target) throws Exception {
        Object[] sources = {"1", "2"};
        Domain domain = Domain.class;
        GeneratedTest.testConvertToDomain(domain, null, sources);
    }

    public static void testConvertToAnotherDomain(String[] targets) throws Exception {
        Object[] sources = {"3", "4"};
        AnotherDomain anotherDomain = AnotherDomain.class;
        GeneratedTest.testConvertToAnotherDomain(anotherDomain, null, sources);
    }

}