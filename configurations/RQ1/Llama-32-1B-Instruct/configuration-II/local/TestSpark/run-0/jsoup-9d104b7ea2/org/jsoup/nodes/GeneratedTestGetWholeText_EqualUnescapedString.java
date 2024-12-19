package org.jsoup.nodes;

public class GeneratedTestGetWholeText_EqualUnescapedString {

    @Test
    public void testGetWholeText_EqualUnescapedString() {
        TextNode text = new TextNode("   ");
        assertEquals("", text.getText());
    }

}