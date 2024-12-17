package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsText {

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
    public void nodeName_ReturnsText() {
        TextNode textNode = new TextNode("#text");
        assertEquals("#text", textNode.nodeName());
    }

}