package org.jsoup.nodes;

public class GeneratedTestText_EqualUnescapedString {

    @Test
    public void testText_EqualUnescapedString() {
        assertEquals("", TextNode.createTextNode("   "));
        assertEquals("\n", TextNode.createTextNode("\n   "));
        assertEquals("\\\\n", TextNode.createTextNode("\\\\n  "));
    }

}