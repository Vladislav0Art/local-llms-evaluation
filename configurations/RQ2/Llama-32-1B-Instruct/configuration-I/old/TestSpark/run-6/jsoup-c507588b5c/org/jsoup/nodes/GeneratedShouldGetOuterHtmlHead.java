package org.jsoup.nodes;

public class GeneratedShouldGetOuterHtmlHead {

    @Test
    public void shouldGetOuterHtmlHead() throws IOException {
        // mock the Document object with a suitable implementation
        Document document = MockDocumentFactory.createDocument();
        Appendable appendable = new StringReader("");
        document.setOutputSettings(new Document.OutputSettings().append(appendable));
        TextNode textNode = new TextNode("Hello World");
        assertTrue(textNode.outerHtmlHead(document, 0, null).isBlank());
    }

}