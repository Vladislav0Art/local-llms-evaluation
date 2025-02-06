package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceShouldStripLeadingWhitespace {

    @Test
    public void normaliseWhitespaceShouldStripLeadingWhitespace() {
        String text = "\tHello World";
        String expected = " Hello World";
        assertEquals(expected, StringUtil.normaliseWhitespace(text));
    }

}