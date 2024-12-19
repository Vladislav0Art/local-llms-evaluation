package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello World   ";
        assertEquals("Hello World", normaliseWhitespace(text));
    }

}