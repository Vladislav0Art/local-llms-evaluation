package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello World!";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5));
        TextNode node3 = new TextNode(" ");
        assert node1.toString().equals(node3.toString());
    }

}