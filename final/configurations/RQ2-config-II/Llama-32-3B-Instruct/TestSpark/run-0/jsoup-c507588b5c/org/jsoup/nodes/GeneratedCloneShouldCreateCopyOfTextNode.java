package org.jsoup.nodes;

public class GeneratedCloneShouldCreateCopyOfTextNode {

    @Test
    public void cloneShouldCreateCopyOfTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode cloned = textNode.clone();
        assertNotNull(cloned.text());
        assertEquals("Hello World", cloned.text());
    }

}