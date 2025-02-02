package com.adobe.epubcheck.tool;

import org.junit.Test;

public class GeneratedTestUnknownArgumentWithField {

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