package org.jsoup.nodes;

public class GeneratedSplitText_GivenNegativeOffset_ThrowsValidationException {


    private TextNode textNode;

    @Before
    public void setupTextNode() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
    }

    @Test
    public void SplitText_GivenNegativeOffset_ThrowsValidationException() {
        String text = "Hello World";
        this.textNode = new TextNode(text);
        assertThrows(ValidationException.class, () -> this.textNode.splitText(-1));
    }

}