package org.jsoup.nodes;

public class GeneratedTestTextSetter {

    @Test
    public void testTextSetter() {
        TextNode textNode = new TextNode("Some text");
        textNode.text("New text");
        assertEquals("New text", textNode.coreValue());
    }

}