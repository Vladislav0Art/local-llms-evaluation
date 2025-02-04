package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_HtmlOutputWithoutOffset_ReturnsString {

    @Test
    public void outerHtmlTail_HtmlOutputWithoutOffset_ReturnsString() throws IOException {
        String text = "Hello World!";
        int offset = 6;
        TextNode textNode = new TextNode(text);
        Document document = new Document();
        Appendable accum = new StringBuilder();
        boolean prettyPrint = true;
        Element parent = new Element("Parent");
        document.addRoot(parent);
        textNode.parentNode = parent;
        textNode.splitText(offset);
        textNode.outerHtmlTail(accum, 1, document.outputSettings());
        assertEquals("", accum.toString());
    }

}