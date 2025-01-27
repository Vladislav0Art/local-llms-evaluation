package com.ezylang.evalex.parser;

public class GeneratedTestValidInput {

    public String[] splitIntoTokens(String input) {
        return input.split("\\s+");
    }
}

public class InputProcessor {
    public static String processInput(String input, Tokenizer tokenizer) {
        String[] expectedTokens = tokenizer.splitIntoTokens(input);
        for (int i = 0; i < expectedTokens.length; i++) {
            if (!expectedTokens[i].isEmpty()) {
                return "Invalid input: expected space but found '" + expectedTokens[i] + "'";
            }
        }
        return "Valid input";
    }

    public static String testEmptyInput() {
        InputProcessor processor = new InputProcessor();
        Tokenizer tokenizer = new Tokenizer();
        String result = processor.processInput(" ", tokenizer);
        return result;
    }

    public static boolean testInvalidSpace() {
        InputProcessor processor = new InputProcessor();
        Tokenizer tokenizer = new Tokenizer();
        String result = processor.processInput("test", tokenizer);
        return result.contains("Invalid input");
    }

    public static String testValidInput() {
        InputProcessor processor = new InputProcessor();
        Tokenizer tokenizer = new Tokenizer();
        String result = processor.processInput("test ", tokenizer);
        return result;
    }
}

public class InputProcessorTest {

    @Test
    public void testValidInput() {
        String result = InputProcessor.testValidInput();
        assertEquals("Valid input", result);
    }

}