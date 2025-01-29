package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestGeneratePublicClass {

    @Test
    public void testGeneratePublicClass() {
        String[] lines1 = new String[2];
        lines1[0] = "public class MyPublicClass {\n";
        lines1[1] = "}\n";

        String[] expectedLines1 = new String[2];
        for (int i = 0; i < lines1.length - 2; i++) {
            expectedLines1[i + 2] += "\n" + lines1[i];
        }
        for (int i = 2; i <= lines1.length; i++) {
            expectedLines1[i] += "\n";
        }

        String[] lines2 = new String[3];
        lines2[0] = "public static void myMethod() {\n";
        lines2[1] = "    System.out.println(\"Hello, World!\");";
        lines2[2] = "}";
        lines2[3] = "}\n";

        for (int i = 4; i < lines2.length - 1; i++) {
            lines2[i + 1] += "\n" + lines2[i];
        }

        String[] expectedLines2 = new String[5];
        expectedLines2[0] = "public static void myMethod() {\n";
        for (int i = 1; i < lines2.length - 1; i++) {
            expectedLines2[i + 1] += "\n" + lines2[i];
        }
        for (int i = lines2.length - 1; i > 0; i--) {
            expectedLines2[i] += "\n";
        }

        assertEquals(expectedLines1, Main.class.getResourceAsStream("MyPublicClass.java").readAllBytes());
        assertEquals(expectedLines2, Main.class.getResourceAsStream("MyMethod.java").readAllBytes());
    }

}