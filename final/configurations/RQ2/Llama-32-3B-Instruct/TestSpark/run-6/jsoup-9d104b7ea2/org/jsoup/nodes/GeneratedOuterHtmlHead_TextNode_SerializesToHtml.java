package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_TextNode_SerializesToHtml {

    @Test
    public void outerHtmlHead_TextNode_SerializesToHtml() throws IOException {
        // Given
        TextNode textNode = new TextNode("Hello World");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // When
        textNode.outerHtmlHead(accum, depth, out);

        // Then
        assertNotNull(accum);
        assertEquals("<p>Hello World</p>", accum.toString());
    }

}