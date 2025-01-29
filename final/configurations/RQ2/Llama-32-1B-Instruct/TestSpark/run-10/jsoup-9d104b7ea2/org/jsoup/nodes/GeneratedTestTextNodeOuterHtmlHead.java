package org.jsoup.nodes;

public class GeneratedTestTextNodeOuterHtmlHead {

    @Test
    public void testTextNodeOuterHtmlHead() {
        Document document = Document.createDocumentBuilder();
        Appendable accum = document.out;
        int depth = 0;
        TextNode root = new TextNode("Hello, World!");
        root.outerHtmlHead(accum, depth, Document.OutputSettings.INDENT_NO_SPACE);
        assertEquals("  Hello, World!", root.outerHtmlHead(accum, depth, Document.OutputSettings.INDENT_NO_SPACE));
    }

}