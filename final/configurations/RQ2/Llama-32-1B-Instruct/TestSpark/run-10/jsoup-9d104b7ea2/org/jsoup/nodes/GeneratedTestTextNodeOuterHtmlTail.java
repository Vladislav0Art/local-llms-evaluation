package org.jsoup.nodes;

public class GeneratedTestTextNodeOuterHtmlTail {

    @Test
    public void testTextNodeOuterHtmlTail() {
        Document document = Document.createDocumentBuilder();
        Appendable accum = document.out;
        int depth = 0;
        TextNode root = new TextNode("Hello ");
        root.outerHtmlTail(accum, depth, Document.OutputSettings.INDENT_NO_SPACE);
        assertEquals("", root.outerHtmlTail(accum, depth, Document.OutputSettings.INDENT_NO_SPACE));
    }

}