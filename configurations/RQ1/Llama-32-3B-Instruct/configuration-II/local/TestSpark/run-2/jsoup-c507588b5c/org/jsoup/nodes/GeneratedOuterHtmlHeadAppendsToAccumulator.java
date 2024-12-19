package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadAppendsToAccumulator {

    private TextNode textNode;

    @Test
    public void outerHtmlHeadAppendsToAccumulator() throws IOException {
        Appendable accumulator = new StringBuilder();
        int depth = 1;
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode = new TextNode("Hello World");

        document.setOuterHTML(accumulator, depth, settings);

        assertEquals("Hello World", accumulator.toString());
    }

}