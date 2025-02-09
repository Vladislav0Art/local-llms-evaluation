package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail_SucceedsWhenOutputSettingsAreSet {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testOuterHtmlTail_SucceedsWhenOutputSettingsAreSet() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode cloned = new TextNode("Hello, World!");
        Appendable accum = new StringBuilder();
        cloned.outerHtmlTail(accum, 1, out);
        assertEquals("<p>Hello, World!</p>", accum.toString());
    }

}