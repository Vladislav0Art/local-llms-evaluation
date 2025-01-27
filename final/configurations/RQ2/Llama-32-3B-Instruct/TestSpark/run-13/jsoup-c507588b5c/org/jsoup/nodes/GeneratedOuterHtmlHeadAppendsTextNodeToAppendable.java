package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadAppendsTextNodeToAppendable {

    @Test
    public void outerHtmlHeadAppendsTextNodeToAppendable() throws IOException {
        // Given
        StringBuilder appendable = new StringBuilder();
        int depth = 1;
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        // When
        TextNode textNode = new TextNode("example");
        textNode.outerHtmlHead(appendable, depth, outputSettings);

        // Then
        assertEquals("html>body><p>example</p></body>", appendable.toString());
    }

}