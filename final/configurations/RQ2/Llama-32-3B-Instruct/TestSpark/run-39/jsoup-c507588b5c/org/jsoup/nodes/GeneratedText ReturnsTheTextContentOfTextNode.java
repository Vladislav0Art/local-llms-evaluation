package org.jsoup.nodes;

public class GeneratedText ReturnsTheTextContentOfTextNode {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void text

    ReturnsTheTextContentOfTextNode() {
        String actual = node.text();
        assertEquals("", StringUtil.trim(actual), 0.01);
    }

}