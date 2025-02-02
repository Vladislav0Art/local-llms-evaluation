package org.jsoup.nodes;

public class GeneratedTestGetWholeText_ReturnsWholeText {

    @Test
    public void testGetWholeText_ReturnsWholeText() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, getWholeText(textNode));
    }

}