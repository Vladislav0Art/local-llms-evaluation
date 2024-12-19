package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode node1 = TextNode.splitText(8);
        TextNode node2 = TextNode.splitText(20);

        assertEquals("Hello ", node1.getText());
        assertEquals("", node2.getText());

        assertEquals(node1, node2);
    }

}