package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_HtmlOutputWithOffset_ReturnsString {

    @Test
    public void outerHtmlHead_HtmlOutputWithOffset_ReturnsString() throws IOException {
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
        textNode.outerHtmlHead(accum, 1, document.outputSettings());
        assertEquals("<span>Hello</span><br><span>World!</span>", accum.toString());
    }

}