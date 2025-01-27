package org.jsoup.nodes;

public class GeneratedNewNodeTextTest {

    @Test
    public void newNodeTextTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

}