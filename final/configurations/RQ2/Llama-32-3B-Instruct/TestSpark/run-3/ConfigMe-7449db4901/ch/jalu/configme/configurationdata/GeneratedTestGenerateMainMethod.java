package ch.jalu.configme.configurationdata;

public class GeneratedTestGenerateMainMethod {

    /**
     * Test for generating public static void main(String[] args) method.
     */

    @Test
    public void testGenerateMainMethod() {
        String mainMethod = generateCode("public static void main(String[] args)\n" +
                "{\n" +
                "    System.out.println(\"Main Method\");\n" +
                "}");
        assertEquals("public static void main(String[] args)\n{" +
                "\n" +
                "    System.out.println(\"Main Method\");\n" +
                "}", mainMethod);
    }

}