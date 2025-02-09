package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_SucceedsWhenNoOutputSettings {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void outerHtmlHead_SucceedsWhenNoOutputSettings() throws IOException {
        node.outerHtmlHead(accum, 1, null);
        assertEquals("", accum.toString(), 0.01);
    }

}