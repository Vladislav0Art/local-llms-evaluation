package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_SucceedsWhenNoOutputSettings {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void outerHtmlTail_SucceedsWhenNoOutputSettings() {
        node.outerHtmlTail(accum, 1, null);
        assertEquals("", accum.toString(), 0.01);
    }

}