package org.jsoup.nodes;

public class GeneratedIsBlank_returnsTrue_if_document_is_empty {

    @Test
    public void isBlank_returnsTrue_if_document_is_empty() {
        Document document = new Document();
        assertTextIsBlank(document);
    }

}