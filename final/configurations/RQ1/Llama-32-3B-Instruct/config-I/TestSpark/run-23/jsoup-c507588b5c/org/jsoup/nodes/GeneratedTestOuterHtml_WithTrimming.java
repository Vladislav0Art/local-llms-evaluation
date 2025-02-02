package org.jsoup.nodes;

public class GeneratedTestOuterHtml_WithTrimming {

    @Test
    public void testOuterHtml_WithTrimming() throws IOException {
        String text = "   Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        outerHtmlHead(accum, 0, out);
        assertEquals("Hello World!", accum.toString());
    }

}