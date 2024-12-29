package org.jsoup.nodes;

public class GeneratedTestTextMethod {

    @Test
    public void testTextMethod() {
        TextNode textNode = new TextNode("test");
        String text = textNode.text();
        assertEquals("test", text);
    }

}