package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHeadWithPrettyPrint {

    @Test
    public void testOuterHtmlHeadWithPrettyPrint() throws IOException {
        TextNode textNode = new TextNode("text");
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.createDefault().prettyPrint(true));
        assertEquals("text", accum.toString());
    }

}