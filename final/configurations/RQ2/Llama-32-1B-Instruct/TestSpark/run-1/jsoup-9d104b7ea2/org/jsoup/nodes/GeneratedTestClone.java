package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode cloned = textNode.clone();
        assertTrue(cloned.text().equals(textNode.text()));
    }

}