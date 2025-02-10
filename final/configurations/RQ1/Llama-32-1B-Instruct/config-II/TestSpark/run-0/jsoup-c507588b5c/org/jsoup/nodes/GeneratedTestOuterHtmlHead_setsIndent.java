package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead_setsIndent {

    @Test
    public void testOuterHtmlHead_setsIndent() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        document.outputSettings().indent(accum, depth);
        TextNode textNode = new TextNode("abc");
        textNode.outerHtmlHead(accum, depth, document.outputSettings());
        assertEquals(true, textNode.isBlank());
    }

}