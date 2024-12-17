package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        // Test that getWholeText returns unencoded, normalised text
        TextNode doc = new TextNode("<p>Hello <b>World</b></p>");
        assertEquals("Hello <b>World</b>", doc.getText());
    }

}