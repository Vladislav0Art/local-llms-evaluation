package org.jsoup.nodes;

public class GeneratedTextReturnsUnencodedText {

    @Test
    public void textReturnsUnencodedText() {
        String encodedText = "&lt;Hello&gt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

}