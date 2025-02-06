package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_Appendable depthDocumentOutputSettings_ThrowsIOException {

    @Test
    public void outerHtmlHead_Appendable

    depthDocumentOutputSettings_ThrowsIOException() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        assertThrows(IOException.class, () -> textNode.outerHtmlHead(accum, 0, out));
    }

}