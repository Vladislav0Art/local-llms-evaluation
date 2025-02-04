package org.jsoup.nodes;

public class GeneratedClone_ReturnsNewTextNode {

    @Test
    public void clone_ReturnsNewTextNode() {
        TextNode originalTextNode = new TextNode("Hello");
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.text(), clonedTextNode.text());
    }

    static TextNode textNode;

    static {
        String encodedText = "&lt;Hello&gt;";
        textNode = TextNode.createFromEncoded(encodedText);
    }

}