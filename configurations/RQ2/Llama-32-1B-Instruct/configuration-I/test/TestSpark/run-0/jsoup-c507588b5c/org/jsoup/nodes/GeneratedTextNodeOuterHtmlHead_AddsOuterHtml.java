package org.jsoup.nodes;

public class GeneratedTextNodeOuterHtmlHead_AddsOuterHtml {

    @Test
    public void TextNodeOuterHtmlHead_AddsOuterHtml() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document(accum, depth, out);
        NodeUnderTest node = new NodeUnderTest("Hello, World!");
        node.outerHtmlHead(accum, depth, out).toString().trim();
        assertEquals("<!DOCTYPE html><html></html>", accum.toString());
    }

}