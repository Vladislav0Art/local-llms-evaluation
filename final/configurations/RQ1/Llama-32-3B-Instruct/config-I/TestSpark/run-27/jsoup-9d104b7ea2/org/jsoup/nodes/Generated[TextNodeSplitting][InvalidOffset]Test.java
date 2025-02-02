package org.jsoup.nodes;

public class Generated[TextNodeSplitting][InvalidOffset]

Test {

    private TextNode textNode;

    @Test
    public void [TextNodeSplitting][InvalidOffset]Test() {
        String originalText = "Hello, World!";
        int offset = 10;
        textNode = new TextNode(originalText);
        assertThrows(IndexOutOfBoundsException.class, () -> textNode.splitText(offset));
    }

}