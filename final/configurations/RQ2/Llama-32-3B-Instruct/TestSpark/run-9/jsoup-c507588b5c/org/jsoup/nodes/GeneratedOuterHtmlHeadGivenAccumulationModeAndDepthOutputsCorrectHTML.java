package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadGivenAccumulationModeAndDepthOutputsCorrectHTML {

    @Test
    public void outerHtmlHeadGivenAccumulationModeAndDepthOutputsCorrectHTML() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, depth, out);
        assertNotNull(accum.toString());
        assertTrue(accum.toString().contains("<div>"));
    }

}