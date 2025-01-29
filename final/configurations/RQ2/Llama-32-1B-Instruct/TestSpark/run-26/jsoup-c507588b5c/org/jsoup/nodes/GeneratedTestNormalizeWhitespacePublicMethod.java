package org.jsoup.nodes;

public class GeneratedTestNormalizeWhitespacePublicMethod {

    @Test
    public void testNormalizeWhitespacePublicMethod() {
        String input = "   hello   ";
        String expectedOutput = "hello";
        assertEquals("hello", TestUtils.normalizeWhitespace(input));
    }

}