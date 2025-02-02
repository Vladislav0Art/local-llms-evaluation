package org.jsoup.nodes;

public class GeneratedTestTrimmingWhiteSpaceAfterSiblingNodes {

    @Test
    public void testTrimmingWhiteSpaceAfterSiblingNodes() {
        String siblingNodes = "   <br> World!";
        TextNode node = new TextNode(siblingNodes);
        String result = String.valueOf(node.getText());
        assertEquals("World!", result);
    }

}