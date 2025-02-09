package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_StripsProperly {

    @Test
    public void normaliseWhitespace_StripsProperly() {
        String text = " Hello, World!";
        String expectedOutput = "Hello, World!";
        assertEquals(expectedOutput, StringUtil.normaliseWhitespace(text));
    }

}