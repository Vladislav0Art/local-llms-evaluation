package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_GivenText_ReturnsNormalisedText {

    @Test
    public void normaliseWhitespace_GivenText_ReturnsNormalisedText() {
        String text = " Hello World ";
        String result = StringUtil.normaliseWhitespace(text);
        assertEquals("Hello World", result);
    }

}