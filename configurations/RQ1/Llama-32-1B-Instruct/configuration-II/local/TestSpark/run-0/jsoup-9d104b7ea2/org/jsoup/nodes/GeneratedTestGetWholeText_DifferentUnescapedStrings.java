package org.jsoup.nodes;

public class GeneratedTestGetWholeText_DifferentUnescapedStrings {

    @Test
    public void testGetWholeText_DifferentUnescapedStrings() {
        TextNode text1 = new TextNode("   ");
        TextNode text2 = new TextNode("\n  hello  \n");
        assertEquals("   ", text1.getText());
        assertEquals("\\n  hello  \\n", text2.getText());
    }

}