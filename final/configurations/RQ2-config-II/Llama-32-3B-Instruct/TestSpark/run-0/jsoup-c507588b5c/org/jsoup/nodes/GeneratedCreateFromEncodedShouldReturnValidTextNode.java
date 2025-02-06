package org.jsoup.nodes;

public class GeneratedCreateFromEncodedShouldReturnValidTextNode {

    @Test
    public void createFromEncodedShouldReturnValidTextNode() throws IOException {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.text());
        assertEquals(encodedText, textNode.text());
    }

}