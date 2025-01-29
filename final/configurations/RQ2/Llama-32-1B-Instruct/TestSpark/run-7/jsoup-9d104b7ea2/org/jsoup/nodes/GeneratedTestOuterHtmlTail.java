package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        MockDocument mockDocument = new MockDocument();
        mockDocument.appendText("Hello World");
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(mockDocument, 0, null);
        assertEquals("<p>Hello World</p>", mockDocument.toString());
    }

}