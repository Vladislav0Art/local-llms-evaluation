package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node1 = new TextNode("<p>Hello, World!</p>");
        TextNode node2 = new TextNode("&lt;p&gt;Hello, World!&lt;/p&gt;");
        Node child1 = node1.splitText(0);
        Node child2 = node2.splitText(4);
        assertTrue(child1.text().equals("Hello, World!"));
        assertTrue(child2.text().equals("<p>Hello, World!</p>"));
    }

}