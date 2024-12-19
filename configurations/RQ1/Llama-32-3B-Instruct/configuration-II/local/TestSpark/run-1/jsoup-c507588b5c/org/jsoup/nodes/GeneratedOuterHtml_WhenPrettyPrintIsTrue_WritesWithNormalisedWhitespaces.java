package org.jsoup.nodes;

public class GeneratedOuterHtml_WhenPrettyPrintIsTrue_WritesWithNormalisedWhitespaces {

    @Test
    public void outerHtml_WhenPrettyPrintIsTrue_WritesWithNormalisedWhitespaces() throws IOException {
        String originalText = "   Hello World  ";
        Document.OutputSettings out = new Document.OutputSettings(true);
        Appendable accum = new StringBuilder();
        TextNode textNode = new TextNode(originalText);
        out.outerHtmlHead(accum, 0, out);
        assertEquals("Hello World", accum.toString());
    }

}