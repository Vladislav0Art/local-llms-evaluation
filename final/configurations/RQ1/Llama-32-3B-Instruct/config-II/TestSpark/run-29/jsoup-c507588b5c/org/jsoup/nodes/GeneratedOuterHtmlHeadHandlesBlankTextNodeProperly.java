package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadHandlesBlankTextNodeProperly {

    @Test
    public void outerHtmlHeadHandlesBlankTextNodeProperly() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

}