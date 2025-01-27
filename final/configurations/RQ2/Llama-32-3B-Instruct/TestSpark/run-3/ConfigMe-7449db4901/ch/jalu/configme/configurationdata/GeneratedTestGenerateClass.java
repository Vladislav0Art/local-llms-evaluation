package ch.jalu.configme.configurationdata;

public class GeneratedTestGenerateClass {

    /**
     * Test for generating public static void main(String[] args) method.
     */

    @Test
    public void testGenerateClass() {
        String mainClass = generateCode("public class Main {\n" +
                "\n" +
                "}");
        assertEquals("public class Main {\n" +
                "\n" +
                "}", mainClass);
    }

}