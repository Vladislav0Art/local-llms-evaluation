package org.jsoup.nodes;

public class GeneratedTestGetWholeText_DifferentEncodedStrings {

    @Test
    public void testGetWholeText_DifferentEncodedStrings() {
        TextNode text1 = new TextNode(Entities.unescape("Hello, World!"));
        TextNode text2 = new TextNode(Entities.unescape("\n  hello  \n"));
        assertEquals("Hello, World!", text1.getText());
        assertEquals("\\n  hello  \\n", text2.getText());
    }

}