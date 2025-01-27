package org.jsoup.nodes;

public class GeneratedOuterHtmlTailAppendsTextNodeToAppendable {

    @Test
    public void outerHtmlTailAppendsTextNodeToAppendable() {
        // Given
        StringBuilder appendable = new StringBuilder();
        int depth = 1;

        // When
        TextNode textNode = new TextNode("example");
        textNode.outerHtmlTail(appendable, depth, new Document.OutputSettings());

        // Then
        assertEquals("<p>example</p>", appendable.toString());
    }

}