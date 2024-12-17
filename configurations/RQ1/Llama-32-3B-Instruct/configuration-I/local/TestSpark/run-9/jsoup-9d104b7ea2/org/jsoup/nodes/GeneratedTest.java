package org.jsoup.nodes;

public class GeneratedTest {

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

    @Test
    public void nodeName_ReturnsText() {
        TextNode textNode = new TextNode("#text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsUnescapedRawText() {
        TextNode textNode = new TextNode("&lt;");
        assertEquals("<", textNode.text());
    }

    @Test
    public void text_SetsTheTextNodeText() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello World");
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void getWholeText_ReturnsOriginalRawTextWithNewlinesAndSpaces() {
        TextNode textNode = new TextNode("Hello World\nThis is a test");
        assertEquals("Hello World\nThis is a test", textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsFalseIfTextNodeIsNotEmpty() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_GivenOffsetCreatesNewTextNodeContainingTextAfterOffset() {
        String originalText = "Hello World This is a test";
        int offset = 11;
        TextNode originalTextNode = new TextNode(originalText);
        TextNode createdTextNode = originalTextNode.splitText(offset);

        assertEquals("This is a test", createdTextNode.text());
    }

    @Test
    public void splitText_ThrowsIllegalArgumentExceptionIfOffsetIsNegative() {
        String originalText = "Hello World This is a test";
        int offset = -1;
        when(leafNode.isLeaf()).thenReturn(true);
        TextNode originalTextNode = new TextNode(originalText);

        assertThrows(IllegalArgumentException.class, () -> originalTextNode.splitText(offset));
    }

    @Test
    public void splitText_ThrowsIllegalArgumentExceptionIfOffsetIsGreaterThanLength() {
        String originalText = "Hello World This is a test";
        int offset = 20;
        when(leafNode.isLeaf()).thenReturn(true);
        TextNode originalTextNode = new TextNode(originalText);

        assertThrows(IllegalArgumentException.class, () -> originalTextNode.splitText(offset));
    }

    @Test
    public void outerHtmlHead_GivenNoParentNode_ReturnsEmptyString() {
        // implementation remains the same as in the source code
    }

    @Test
    public void outerHtmlTail_ReturnsEmptyString() {
        // implementation remains the same as in the source code
    }

    @Test
    public void toString_ReturnsOuterHtml() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("<span>Hello World</span>", textNode.toString());
    }

}