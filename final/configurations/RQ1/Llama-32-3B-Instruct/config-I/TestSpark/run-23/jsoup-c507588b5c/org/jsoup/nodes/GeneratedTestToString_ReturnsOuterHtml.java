package org.jsoup.nodes;

public class GeneratedTestToString_ReturnsOuterHtml {

    @Test
    public void testToString_ReturnsOuterHtml() throws IOException {
        String text = "Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        outerHtmlHead(accum, 0, out);
        assertEquals(accum.toString(), toString(textNode));
    }

    public Object clone() {
        // implementation of clone method
        return null;
    }

}