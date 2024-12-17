package org.jsoup.nodes;

public class GeneratedSplitText_ThrowsIllegalArgumentExceptionIfOffsetIsGreaterThanLength {

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
    public void splitText_ThrowsIllegalArgumentExceptionIfOffsetIsGreaterThanLength() {
        String originalText = "Hello World This is a test";
        int offset = 20;
        when(leafNode.isLeaf()).thenReturn(true);
        TextNode originalTextNode = new TextNode(originalText);

        assertThrows(IllegalArgumentException.class, () -> originalTextNode.splitText(offset));
    }

}