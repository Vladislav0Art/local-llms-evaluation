package org.jsoup.nodes;

public class GeneratedIsBlank_returnsFalse_if_document_contains_text_content {

    @Test
    public void isBlank_returnsFalse_if_document_contains_text_content() {
        String text = "Hello World";
        Document document = new Document();
        document.addTextNode(text);
        assertNotTextIsBlank(document);
    }

}