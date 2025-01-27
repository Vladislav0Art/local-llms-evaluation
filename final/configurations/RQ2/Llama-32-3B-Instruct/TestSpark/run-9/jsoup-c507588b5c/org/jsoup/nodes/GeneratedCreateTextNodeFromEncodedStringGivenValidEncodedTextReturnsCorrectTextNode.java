package org.jsoup.nodes;

public class GeneratedCreateTextNodeFromEncodedStringGivenValidEncodedTextReturnsCorrectTextNode {

    @Test
    public void createTextNodeFromEncodedStringGivenValidEncodedTextReturnsCorrectTextNode() {
        String encodedText = "Hello%2C+World%21";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

}