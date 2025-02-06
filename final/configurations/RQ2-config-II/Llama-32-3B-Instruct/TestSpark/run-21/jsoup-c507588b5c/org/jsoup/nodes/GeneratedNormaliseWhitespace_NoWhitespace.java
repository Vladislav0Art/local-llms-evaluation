package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_NoWhitespace {

    @Test
    public void normaliseWhitespace_NoWhitespace() {
        String text = "hello";
        assertEquals("hello", StringUtil.normaliseWhitespace(text));
    }

}