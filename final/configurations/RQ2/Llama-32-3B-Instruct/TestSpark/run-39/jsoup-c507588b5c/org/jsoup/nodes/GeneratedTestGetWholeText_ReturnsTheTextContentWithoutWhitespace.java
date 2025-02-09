package org.jsoup.nodes;

public class GeneratedTestGetWholeText_ReturnsTheTextContentWithoutWhitespace {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testGetWholeText_ReturnsTheTextContentWithoutWhitespace() {
        node.setText("Hello,World!");
        String expected = "HelloWorld";
        String actual = node.getWholeText();
        assertEquals(expected, actual);
    }

}