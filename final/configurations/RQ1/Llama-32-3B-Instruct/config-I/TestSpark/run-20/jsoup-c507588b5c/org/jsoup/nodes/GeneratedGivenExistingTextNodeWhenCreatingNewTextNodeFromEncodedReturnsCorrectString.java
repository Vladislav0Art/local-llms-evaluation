package org.jsoup.nodes;

public class GeneratedGivenExistingTextNodeWhenCreatingNewTextNodeFromEncodedReturnsCorrectString {

    @Test
    public void givenExistingTextNodeWhenCreatingNewTextNodeFromEncodedReturnsCorrectString() {
        String encodedText = "&lt;Example&gt;";
        String expectedText = "Example";
        TextNode resultTextNode = TextNode.createFromEncoded(encodedText);
        assertEquals(expectedText, resultTextNode.text());
    }

}