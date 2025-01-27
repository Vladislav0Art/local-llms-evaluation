package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadAddsProperHtmlTags {

    @Test
    public void outerHtmlHeadAddsProperHtmlTags() {
        // Given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        TextNode node = new TextNode("Hello World");

        // When
        node.outerHtmlHead(accum, depth, out);

        // Then
        assertEquals("<p>Hello World</p>", accum.toString());
    }

}