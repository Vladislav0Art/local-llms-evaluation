package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        DocumentType type = document.documentType();
        assertNotNull(type);
        assertEquals(HTML5, type.getType());
    }

}