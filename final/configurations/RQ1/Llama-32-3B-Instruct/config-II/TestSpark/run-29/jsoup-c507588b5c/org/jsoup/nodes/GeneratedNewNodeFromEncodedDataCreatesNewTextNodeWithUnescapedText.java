package org.jsoup.nodes;

public class GeneratedNewNodeFromEncodedDataCreatesNewTextNodeWithUnescapedText {

    @Test
    public void newNodeFromEncodedDataCreatesNewTextNodeWithUnescapedText() throws IOException {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Hello&gt; World", textNode.text());
    }

}