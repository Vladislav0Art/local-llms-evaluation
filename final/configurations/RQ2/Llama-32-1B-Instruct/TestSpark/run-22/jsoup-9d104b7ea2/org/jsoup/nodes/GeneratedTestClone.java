package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode original = new TextNode("Hello, World!");
        TextNode clone = (TextNode) original.clone();
        assertEquals(original.getText(), clone.getText());
    }

}