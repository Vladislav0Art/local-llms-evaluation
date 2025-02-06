package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_DoesNotThrowException {

    @Test
    public void createFromEncoded_DoesNotThrowException() throws IOException {
        String encodedText = "Hello";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
    }

}