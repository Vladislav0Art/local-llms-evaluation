package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsTheTextContentWithoutWhitespace {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello, World!");
    }

    @Test
    public void getWholeText_ReturnsTheTextContentWithoutWhitespace() {
        String expected = "Hello,World!";
        String actual = node.getWholeText();
        assertEquals(expected, actual, 0.01);
    }

}