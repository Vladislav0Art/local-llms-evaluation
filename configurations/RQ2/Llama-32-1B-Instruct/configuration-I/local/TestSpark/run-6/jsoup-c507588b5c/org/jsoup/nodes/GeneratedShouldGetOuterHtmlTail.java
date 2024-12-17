package org.jsoup.nodes;

public class GeneratedShouldGetOuterHtmlTail {

    @Test
    public void shouldGetOuterHtmlTail() throws IOException {
        // mock the Document object with a suitable implementation
        Document document = MockDocumentFactory.createDocument();
        Appendable appendable = new StringReader("");
        document.setOutputSettings(new Document.OutputSettings().append(appendable));
        TextNode textNode = new TextNode("<p>Hello World</p>");
        assertTrue(textNode.outerHtmlTail(document, 0, null).isBlank());
    }

}