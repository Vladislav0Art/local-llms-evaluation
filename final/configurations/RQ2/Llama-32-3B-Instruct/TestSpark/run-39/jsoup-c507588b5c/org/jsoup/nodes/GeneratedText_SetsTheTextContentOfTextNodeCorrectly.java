package org.jsoup.nodes;

public class GeneratedText_SetsTheTextContentOfTextNodeCorrectly {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void text_SetsTheTextContentOfTextNodeCorrectly() {
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

}