package org.jsoup.nodes;

public class GeneratedTestOuterHtml_WithoutTrimming {

    @Test
    public void testOuterHtml_WithoutTrimming() throws IOException {
        String text = "   Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        outerHtmlHead(accum, 0, out);
        assertEquals("   Hello World!", accum.toString());
    }

    public String toString(TextNode textNode) throws IOException {
        // implementation of toString method
        return "";
    }

}