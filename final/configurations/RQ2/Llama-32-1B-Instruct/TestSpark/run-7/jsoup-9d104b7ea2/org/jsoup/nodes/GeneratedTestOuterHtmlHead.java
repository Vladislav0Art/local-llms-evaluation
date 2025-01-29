package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        MockDocument mockDocument = new MockDocument();
        mockDocument.appendText("Hello World");
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(mockDocument, 0, null);
        assertEquals("<p>Hello World</p>", mockDocument.toString());
    }

}