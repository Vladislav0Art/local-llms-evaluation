package org.jsoup.nodes;

public class GeneratedTestNormalizeWhitespace {

    @Test
    public void testNormalizeWhitespace() {
        String input = "   hello   ";
        String expectedOutput = "hello";
        assertEquals("hello", TestUtils.normalizeWhitespace(input));
    }

}