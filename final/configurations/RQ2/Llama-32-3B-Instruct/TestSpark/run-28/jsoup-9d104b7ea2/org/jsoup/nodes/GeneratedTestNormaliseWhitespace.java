package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    private static final String DEFAULT = "DEFAULT";

    @Test
    public void testNormaliseWhitespace() {
        String input = "   ";
        String expectedOutput = "   ";
        assertEquals(expectedOutput, StringUtil.normaliseWhitespace(input));
    }

}