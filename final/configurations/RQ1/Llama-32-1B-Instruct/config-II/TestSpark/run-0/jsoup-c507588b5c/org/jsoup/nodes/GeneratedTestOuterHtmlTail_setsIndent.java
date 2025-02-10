package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail_setsIndent {

    @Test
    public void testOuterHtmlTail_setsIndent() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        document.outputSettings().indent(accum, depth);
        TextNode textNode = new TextNode("abc");
        textNode.outerHtmlTail(accum, depth, document.outputSettings());
        assertEquals(true, textNode.isBlank());
    }

}