package org.jsoup.nodes;

public class GeneratedToStringReturnsOuterHtml {

    @Test
    public void toStringReturnsOuterHtml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("Hello World");
        String outerHTML = textNode.outerHtml();
        assertEquals(outerHTML, textNode.toString());
    }

}