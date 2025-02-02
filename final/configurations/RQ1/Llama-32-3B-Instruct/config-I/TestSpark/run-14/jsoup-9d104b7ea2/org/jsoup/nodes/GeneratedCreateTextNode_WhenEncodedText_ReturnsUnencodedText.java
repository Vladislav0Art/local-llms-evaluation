package org.jsoup.nodes;

public class GeneratedCreateTextNode_WhenEncodedText_ReturnsUnencodedText {

    @Test
    public void createTextNode_WhenEncodedText_ReturnsUnencodedText() throws IOException {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        Assert.assertEquals("Hello World", textNode.text());
    }
}

}