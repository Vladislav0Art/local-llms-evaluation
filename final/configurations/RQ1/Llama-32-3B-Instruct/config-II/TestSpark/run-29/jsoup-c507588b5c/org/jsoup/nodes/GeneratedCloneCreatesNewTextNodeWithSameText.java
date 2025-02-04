package org.jsoup.nodes;

public class GeneratedCloneCreatesNewTextNodeWithSameText {

    @Test
    public void cloneCreatesNewTextNodeWithSameText() {
        TextNode textNode = new TextNode("Hello World");
        TextNode cloned = textNode.clone();
        assertEquals("#text", cloned.nodeName());
        assertEquals(textNode.text(), cloned.text());
    }

}