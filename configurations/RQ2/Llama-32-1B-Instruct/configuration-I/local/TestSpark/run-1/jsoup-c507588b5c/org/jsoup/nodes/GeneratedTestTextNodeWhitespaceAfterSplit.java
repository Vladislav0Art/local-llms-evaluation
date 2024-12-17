package org.jsoup.nodes;

public class GeneratedTestTextNodeWhitespaceAfterSplit {

    @Test
    public void testTextNodeWhitespaceAfterSplit() {
        TextNode node1 = new TextNode("");
        TextNode node2 = new TextNode("Hello ");
        assertTrue(node1.splitText(5).isBlank()); // Assuming the split offset is 5
    }

}