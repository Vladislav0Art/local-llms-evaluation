package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testPublicClass() {
        assertTrue(TagValueOf.class.isPublic());
        assertTrue(TagValueOf.publicClassMethod1() instanceof TagValueOf);
        assertTrue(TagValueOf.publicClassMethod2() instanceof TagValueOf);
        assertTrue(TagValueOf.publicClassMethod3() instanceof TagValueOf);
    }

    @Test
    public void testPrivateMethod1() {
        assertTrue(TagValueOf.privateMethod1() instanceof TagValueOf);
        assertTrue(TagValueOf.privateMethod2() instanceof TagValueOf);
        assertTrue(TagValueOf.privateMethod3() instanceof TagValueOf);
    }

    @Test
    public void testStaticVariable1() {
        assertTrue(TagValueOf.staticVariable1 == null);
    }

    @Test
    public void testPublicClassMethod1() {
        assertTrue(TagValueOf.publicClassMethod1() instanceof TagValueOf);
    }

    @Test
    public void testPrivateMethod2() {
        assertTrue(TagValueOf.privateMethod2() instanceof TagValueOf);
    }

    @Test
    public void testStaticVariable2() {
        assertTrue(TagValueOf.staticVariable2 == null);
    }

    @Test
    public void testPublicClassMethod2() {
        assertTrue(TagValueOf.publicClassMethod2() instanceof TagValueOf);
    }

    @Test
    public void testPrivateMethod3() {
        assertTrue(TagValueOf.privateMethod3() instanceof TagValueOf);
    }

    @Test
    public void testStaticVariable3() {
        assertTrue(TagValueOf.staticVariable3 == null);
    }

}