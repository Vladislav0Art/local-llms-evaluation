package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_TextNode_SerializesToHtml {

    @Test
    public void outerHtmlTail_TextNode_SerializesToHtml() throws IOException {
        // Given
        TextNode textNode = new TextNode("Hello World");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // When
        textNode.outerHtmlTail(accum, depth, out);

        // Then
        assertNotNull(accum);
        assertEquals("</p>Hello World", accum.toString());
    }

}