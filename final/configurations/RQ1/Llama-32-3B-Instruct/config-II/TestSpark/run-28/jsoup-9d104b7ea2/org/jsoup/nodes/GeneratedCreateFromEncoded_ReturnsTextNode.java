package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_ReturnsTextNode {

    @Test
    public void createFromEncoded_ReturnsTextNode() {
        // given
        String encodedText = "&lt;Hello World&gt;";

        // when
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // then
        assertNotNull(textNode);
    }

}