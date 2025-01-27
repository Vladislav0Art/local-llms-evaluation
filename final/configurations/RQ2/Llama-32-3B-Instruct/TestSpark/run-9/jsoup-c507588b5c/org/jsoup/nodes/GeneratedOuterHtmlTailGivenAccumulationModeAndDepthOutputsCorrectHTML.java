package org.jsoup.nodes;

public class GeneratedOuterHtmlTailGivenAccumulationModeAndDepthOutputsCorrectHTML {

    @Test
    public void outerHtmlTailGivenAccumulationModeAndDepthOutputsCorrectHTML() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, depth, out);
        assertNotNull(accum.toString());
        assertTrue(accum.toString().contains("</div>"));
    }

}