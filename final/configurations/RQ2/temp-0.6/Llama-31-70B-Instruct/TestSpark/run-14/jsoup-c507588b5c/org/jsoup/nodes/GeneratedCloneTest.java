package org.jsoup.nodes;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode textNode = new TextNode("Some Text");
        TextNode clonedTextNode = textNode.clone();
        assertEquals("Some Text", clonedTextNode.text());
    }

}