package org.jsoup.nodes;

public class GeneratedOuterHtml_ThrowsIOException {

    @Test
    public void outerHtml_ThrowsIOException() {
        // Arrange & Act & Assert
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode();
        assertThrows(IOException.class, () -> textNode.outerHtmlHead(accum, 0, out));
    }

}