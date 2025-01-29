package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestGeneratePublicMethods {

    @Test
    public void testGeneratePublicMethods() {
        String[] lines1 = new String[5];
        lines1[0] = "public class MyPublicClass {\n";
        lines1[1] = "public static void myMethod1() {\n";
        lines1[2] = "    System.out.println(\"Hello, World!\");\n";
        lines1[3] = "}";
        lines1[4] = "}\n";

        String[] expectedLines1 = new String[5];
        for (int i = 0; i < lines1.length - 2; i++) {
            expectedLines1[i + 2] += "\n" + lines1[i];
        }
        for (int i = 5; i <= lines1.length; i++) {
            expectedLines1[i] += "\n";
        }

        String[] lines2 = new String[4];
        lines2[0] = "public class MyPublicClass {\n";
        lines2[1] = "}";
        lines2[2] = "}\n";

        for (int i = 3; i <= lines2.length - 1; i++) {
            lines2[i + 1] += "\n" + lines2[i];
        }

        String[] expectedLines2 = new String[4];
        expectedLines2[0] = "public class MyPublicClass {\n";
        for (int i = 1; i < lines2.length - 1; i++) {
            expectedLines2[i + 1] += "\n" + lines2[i];
        }
        for (int i = 3; i <= lines2.length; i++) {
            expectedLines2[i] += "\n";
        }

        assertEquals(expectedLines1, Main.class.getResourceAsStream("MyPublicClass.java").readAllBytes());
        assertEquals(expectedLines2, Main.class.getResourceAsStream("myMethod.java").readAllBytes());
    }

}