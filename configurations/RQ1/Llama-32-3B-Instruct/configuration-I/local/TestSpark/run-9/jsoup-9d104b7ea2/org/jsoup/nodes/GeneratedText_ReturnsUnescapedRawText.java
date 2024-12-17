package org.jsoup.nodes;

public class GeneratedText_ReturnsUnescapedRawText {

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
    public void text_ReturnsUnescapedRawText() {
        TextNode textNode = new TextNode("&lt;");
        assertEquals("<", textNode.text());
    }

}