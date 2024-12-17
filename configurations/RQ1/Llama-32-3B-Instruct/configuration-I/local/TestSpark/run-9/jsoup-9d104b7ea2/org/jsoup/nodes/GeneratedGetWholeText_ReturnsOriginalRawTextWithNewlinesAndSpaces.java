package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsOriginalRawTextWithNewlinesAndSpaces {

    private TextNode parentNode;

    @Mock
    private LeafNode leafNode;

    public TextNodeTest() {
    }

    @Before
    public void setup() {
        parentNode = new TextNode("");
    }

    @Test
    public void getWholeText_ReturnsOriginalRawTextWithNewlinesAndSpaces() {
        TextNode textNode = new TextNode("Hello World\nThis is a test");
        assertEquals("Hello World\nThis is a test", textNode.getWholeText());
    }

}