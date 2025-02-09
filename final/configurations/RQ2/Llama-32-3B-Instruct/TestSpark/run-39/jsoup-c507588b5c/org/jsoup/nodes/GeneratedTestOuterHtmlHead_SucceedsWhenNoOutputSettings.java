package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead_SucceedsWhenNoOutputSettings {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testOuterHtmlHead_SucceedsWhenNoOutputSettings() throws IOException {
        Document.OutputSettings out = null;
        TextNode cloned = new TextNode("Hello, World!");
        Appendable accum = new StringBuilder();
        cloned.outerHtmlHead(accum, 1, out);
        assertEquals("<p>Hello, World!</p>", accum.toString());
    }

}