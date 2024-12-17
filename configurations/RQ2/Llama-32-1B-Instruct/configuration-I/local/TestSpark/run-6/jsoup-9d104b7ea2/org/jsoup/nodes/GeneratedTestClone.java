package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = (TextNode) originalText.clone();
        assertNotSame(originalText, clonedText);
    }

}