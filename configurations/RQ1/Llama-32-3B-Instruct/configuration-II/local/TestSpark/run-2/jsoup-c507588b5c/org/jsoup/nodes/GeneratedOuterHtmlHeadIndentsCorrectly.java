package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIndentsCorrectly {

    private TextNode textNode;

    @Test
    public void outerHtmlHeadIndentsCorrectly() throws IOException {
        Appendable accumulator = new StringBuilder();
        int depth = 1;
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode = new TextNode("   Hello World");

        document.setOuterHTML(accumulator, depth, settings);

        assertEquals("<p><span>Hello World</span></p>", accumulator.toString());
    }

}