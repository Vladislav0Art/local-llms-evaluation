package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    private Appendable mockAppendable;
    private Document mockDocument;

    @Test
    public void testGetWholeText() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello World!", node.getWholeText());
    }

}