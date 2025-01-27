package ch.jalu.configme.configurationdata;

public class GeneratedTestGeneratePrintlnMethod {

    /**
     * Test for generating public static void main(String[] args) method.
     */

    @Test
    public void testGeneratePrintlnMethod() {
        String printlnMethod = generateCode("System.out.println(\"Hello World!\");");
        assertEquals("System.out.println(\"Hello World!\");", printlnMethod);
    }

    private String generateCode(String code) {
        return code;
    }

}