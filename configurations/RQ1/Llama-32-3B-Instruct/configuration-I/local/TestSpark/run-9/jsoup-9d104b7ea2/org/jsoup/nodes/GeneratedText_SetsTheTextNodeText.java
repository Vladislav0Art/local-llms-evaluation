package org.jsoup.nodes;

public class GeneratedText_SetsTheTextNodeText {

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
    public void text_SetsTheTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}