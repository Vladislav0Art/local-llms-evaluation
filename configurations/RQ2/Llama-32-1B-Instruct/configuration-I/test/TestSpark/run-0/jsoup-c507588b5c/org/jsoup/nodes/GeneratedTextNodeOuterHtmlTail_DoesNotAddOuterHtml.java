package org.jsoup.nodes;

public class GeneratedTextNodeOuterHtmlTail_DoesNotAddOuterHtml {

    @Test
    public void TextNodeOuterHtmlTail_DoesNotAddOuterHtml() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document(accum, depth, out);
        NodeUnderTest node = new NodeUnderTest("Hello, World!");
        node.outerHtmlTail(accum, depth, out).toString().trim();
        assertEquals("<html></html>", accum.toString());
    }

}