package org.jsoup.nodes;

public class GeneratedNewNodeText_SimpleTextNode {

    @Test
    public void newNodeText_SimpleTextNode() {
        String expected = "text";
        TextNode actual = new TextNode(expected);
        assertEquals(expected, actual.text());
    }

}