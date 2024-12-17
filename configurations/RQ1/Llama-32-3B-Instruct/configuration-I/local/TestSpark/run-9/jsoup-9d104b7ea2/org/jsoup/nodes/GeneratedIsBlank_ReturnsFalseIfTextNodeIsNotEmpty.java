package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsFalseIfTextNodeIsNotEmpty {

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
    public void isBlank_ReturnsFalseIfTextNodeIsNotEmpty() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}