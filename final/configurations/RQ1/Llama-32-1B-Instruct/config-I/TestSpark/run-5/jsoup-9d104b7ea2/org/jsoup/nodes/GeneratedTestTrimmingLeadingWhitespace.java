package org.jsoup.nodes;

public class GeneratedTestTrimmingLeadingWhitespace {

    @Test
    public void testTrimmingLeadingWhitespace() {
        String leadingWhitespace = "   Hello World!";
        String expected = "Hello World";
        String result = trimLeadingWhitespace(leadingWhitespace);
        assertEquals(expected, result);
    }

}