package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("text");
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.createDefault());
        assertEquals("text", accum.toString());
    }

}