package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_SucceedsWhenOutputSettingsAreSet {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void outerHtmlHead_SucceedsWhenOutputSettingsAreSet() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings(10, 20);
        String expected = "<p>Hello World</p>";
        node.outerHtmlHead(accum, 1, out);
        assertEquals(expected, accum.toString(), 0.01);
    }

}