package org.jsoup.nodes;

public class GeneratedCloneReturnsNewTextNodeWithSameText {

    @Test
    public void cloneReturnsNewTextNodeWithSameText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        TextNode clone = textNode.clone();
        assertEquals(text, clone.text());
    }

}