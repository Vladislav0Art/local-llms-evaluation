package org.jsoup.nodes;

public class GeneratedOuterHtmlTailDoesNothing {

    @Test
    public void outerHtmlTailDoesNothing() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

}