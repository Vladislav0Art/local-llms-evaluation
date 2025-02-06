package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_Appendable depthDocumentOutputSettings_NoThrowIOException {

    @Test
    public void outerHtmlTail_Appendable

    depthDocumentOutputSettings_NoThrowIOException() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, 0, out);
    }

}