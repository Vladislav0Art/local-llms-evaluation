package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHeadBlankTextNode {

    @Test
    public void testOuterHtmlHeadBlankTextNode() {
        TextNode textNode = new TextNode("");
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("", accum.toString());
    }

}