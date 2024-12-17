package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenRawText_ReturnsTextNode {

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
    public void createTextNode_GivenRawText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

}