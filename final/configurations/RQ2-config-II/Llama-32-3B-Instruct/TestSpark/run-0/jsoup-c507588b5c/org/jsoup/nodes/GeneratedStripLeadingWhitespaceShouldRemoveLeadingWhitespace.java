package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespaceShouldRemoveLeadingWhitespace {

    @Test
    public void stripLeadingWhitespaceShouldRemoveLeadingWhitespace() {
        String text = "\tHello World";
        String expected = "Hello World";
        assertEquals(expected, StringUtil.stripLeadingWhitespace(text));
    }

}