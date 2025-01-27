package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String input = "Hello World";
        assertEquals("Hello World", StringUtil.normaliseWhitespace(input));
    }

}