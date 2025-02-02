package org.jsoup.nodes;

public class GeneratedTestTrimmingTrailingWhitespace {

    @Test
    public void testTrimmingTrailingWhitespace() {
        String trailingWhitespace = "   World!";
        String expected = "World!";
        String result = trimLeadingWhitespace(trailingWhitespace);
        assertEquals(expected, result);
    }

}