package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_SucceedsWhenOutputSettingsAreSet {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void outerHtmlTail_SucceedsWhenOutputSettingsAreSet() {
        Document.OutputSettings out = new Document.OutputSettings(10, 20);
        String expected = "<p>Hello World</p>";
        node.outerHtmlTail(accum, 1, out);
        assertEquals(expected, accum.toString(), 0.01);
    }

}