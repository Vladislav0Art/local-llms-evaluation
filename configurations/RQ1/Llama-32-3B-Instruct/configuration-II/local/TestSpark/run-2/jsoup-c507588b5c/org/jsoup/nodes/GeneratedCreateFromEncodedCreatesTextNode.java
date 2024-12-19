package org.jsoup.nodes;

public class GeneratedCreateFromEncodedCreatesTextNode {

    private TextNode textNode;

    @Test
    public void createFromEncodedCreatesTextNode() {
        String encodedText = "&lt;Hello World&gt;";
        textNode = TextNode.createFromEncoded(encodedText);
        assert textNode != null;
    }

}