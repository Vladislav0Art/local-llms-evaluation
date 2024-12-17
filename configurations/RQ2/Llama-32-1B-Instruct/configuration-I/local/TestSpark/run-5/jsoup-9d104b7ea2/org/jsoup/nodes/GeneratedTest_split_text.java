package org.jsoup.nodes;

public class GeneratedTest_split_text {

    @Test
    public void test_split_text() {
        TextNode node1 = new TextNode("Hello ");
        TextNode node2 = new TextNode("World");
        Node child1 = node1.splitText(6);
        Node child2 = node2.getWholeText();
        assertEquals(node1, child1);
        assertEquals(node2, child2);
    }

}