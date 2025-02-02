package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testNoFileSpecified() {
        try {
            Main.main(new String[]{"-b"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid file specification", e.getMessage());
        }
    }

    @Test
    public void testUnknownMode() {
        try {
            Main.main(new String[]{"mode", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid mode in command line argument", e.getMessage());
        }
    }

    @Test
    public void testNoCustomMessageFileSpecified() {
        try {
            Main.main(new String[]{"-a", "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid file specification in command line argument", e.getMessage());
        }
    }

    @Test
    public void testUnknownArgumentWithPublicMethod() {
        try {
            Main.main(new String[]{"publicMethod", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid method call in command line argument", e.getMessage());
        }
    }

    @Test
    public void testUnknownArgumentWithPublicVariable() {
        try {
            Main.main(new String[]{"publicVariable", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid method call in command line argument", e.getMessage());
        }
    }

    @Test
    public void testUnknownArgumentWithMethod() {
        try {
            Main.main(new String[]{"publicMethod", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid method call in command line argument", e.getMessage());
        }
    }

    @Test
    public void testUnknownArgumentWithField() {
        try {
            Main.main(new String[]{"publicVariable", null, "file"});
            fail("Expected Main.main(String[]) to throw an exception");
        } catch (Exception e) {
            assertEquals("Invalid method call in command line argument", e.getMessage());
        }
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println(Main.testNoFileSpecified());
            System.out.println(Main.testUnknownMode());
            System.out.println(Main.testNoCustomMessageFileSpecified());
            System.out.println(Main.testUnknownArgumentWithPublicMethod());
            System.out.println(Main.testUnknownArgumentWithPublicVariable());
            System.out.println(Main.testUnknownArgumentWithMethod());
            System.out.println(Main.testUnknownArgumentWithField());
        }

        public static String testNoFileSpecified() {
            return "Invalid file specification";
        }

        public static String testUnknownMode() {
            return "Invalid mode in command line argument";
        }

        public static String testNoCustomMessageFileSpecified() {
            return "Invalid file specification in command line argument";
        }
    }

}