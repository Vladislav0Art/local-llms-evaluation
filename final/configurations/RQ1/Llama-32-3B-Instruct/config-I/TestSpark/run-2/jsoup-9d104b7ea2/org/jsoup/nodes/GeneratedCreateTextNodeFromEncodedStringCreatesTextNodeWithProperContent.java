package org.jsoup.nodes;

public class GeneratedCreateTextNodeFromEncodedStringCreatesTextNodeWithProperContent {

    @Test
    public void createTextNodeFromEncodedStringCreatesTextNodeWithProperContent() {
        String encodedText = "&lt;Hello&gt;";
        TextNode createdTextNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(createdTextNode);
        assertEquals("<", createdTextNode.text());
    }

}