package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_encodedText_isNotNull {

    @Test
    public void createFromEncoded_encodedText_isNotNull() {
        String encodedText = "test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
    }

}