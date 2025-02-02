package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTailBlankTextNode {

    @Test
    public void testOuterHtmlTailBlankTextNode() {
        TextNode textNode = new TextNode("");
        Appendable accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, null);
        assertEquals("", accum.toString());
    }

}