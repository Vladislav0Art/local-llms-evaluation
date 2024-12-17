package org.jsoup.nodes;

public class GeneratedSplitText_ThrowsIllegalArgumentExceptionIfOffsetIsNegative {

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
    public void splitText_ThrowsIllegalArgumentExceptionIfOffsetIsNegative() {
        String originalText = "Hello World This is a test";
        int offset = -1;
        when(leafNode.isLeaf()).thenReturn(true);
        TextNode originalTextNode = new TextNode(originalText);

        assertThrows(IllegalArgumentException.class, () -> originalTextNode.splitText(offset));
    }

}