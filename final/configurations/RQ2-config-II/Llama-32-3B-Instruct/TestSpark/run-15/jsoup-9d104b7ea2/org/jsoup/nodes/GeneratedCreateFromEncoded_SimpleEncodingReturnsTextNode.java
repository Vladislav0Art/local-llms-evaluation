package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_SimpleEncodingReturnsTextNode {

    @Test
    public void createFromEncoded_SimpleEncodingReturnsTextNode() {
        String encodedText = "test";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assert true == Validate.notNull(node, "Created text node must not be null");
    }

}