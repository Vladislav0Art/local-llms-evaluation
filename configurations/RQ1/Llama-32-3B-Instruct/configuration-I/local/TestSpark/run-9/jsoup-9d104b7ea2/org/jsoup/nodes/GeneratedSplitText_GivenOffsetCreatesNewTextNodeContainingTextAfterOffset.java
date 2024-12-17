package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetCreatesNewTextNodeContainingTextAfterOffset {

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
    public void splitText_GivenOffsetCreatesNewTextNodeContainingTextAfterOffset() {
        String originalText = "Hello World This is a test";
        int offset = 11;
        TextNode originalTextNode = new TextNode(originalText);
        TextNode createdTextNode = originalTextNode.splitText(offset);

        assertEquals("This is a test", createdTextNode.text());
    }

}