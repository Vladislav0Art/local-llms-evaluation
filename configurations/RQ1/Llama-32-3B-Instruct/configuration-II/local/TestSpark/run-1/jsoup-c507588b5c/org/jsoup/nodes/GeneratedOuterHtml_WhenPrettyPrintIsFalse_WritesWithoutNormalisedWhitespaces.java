package org.jsoup.nodes;

public class GeneratedOuterHtml_WhenPrettyPrintIsFalse_WritesWithoutNormalisedWhitespaces {

    @Test
    public void outerHtml_WhenPrettyPrintIsFalse_WritesWithoutNormalisedWhitespaces() throws IOException {
        String originalText = "   Hello World  ";
        Document.OutputSettings out = new Document.OutputSettings(false);
        Appendable accum = new StringBuilder();
        TextNode textNode = new TextNode(originalText);
        out.outerHtmlHead(accum, 0, out);
        assertEquals("  Hello World  ", accum.toString());
    }

}