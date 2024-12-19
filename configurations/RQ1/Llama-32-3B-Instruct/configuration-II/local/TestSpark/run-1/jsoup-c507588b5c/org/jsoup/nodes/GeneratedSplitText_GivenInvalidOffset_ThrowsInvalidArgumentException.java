package org.jsoup.nodes;

public class GeneratedSplitText_GivenInvalidOffset_ThrowsInvalidArgumentException {

    @Test
    public void splitText_GivenInvalidOffset_ThrowsInvalidArgumentException() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        int offset = -1;
        try {
            textNode.splitText(offset);
            assert false : "Expected InvalidArgumentException to be thrown";
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}