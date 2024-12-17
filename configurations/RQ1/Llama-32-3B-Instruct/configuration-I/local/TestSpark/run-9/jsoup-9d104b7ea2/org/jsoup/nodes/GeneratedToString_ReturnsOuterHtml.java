package org.jsoup.nodes;

public class GeneratedToString_ReturnsOuterHtml {

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
    public void toString_ReturnsOuterHtml() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("<span>Hello World</span>", textNode.toString());
    }

}