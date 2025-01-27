package org.jsoup.nodes;

public class GeneratedOuterHtmlTailAddsProperHtmlTags {

    @Test
    public void outerHtmlTailAddsProperHtmlTags() {
        // Given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        TextNode node = new TextNode("Hello World");

        // When
        node.outerHtmlTail(accum, depth, out);

        // Then
        assertEquals("<p>Hello World</p>", accum.toString());
    }

}