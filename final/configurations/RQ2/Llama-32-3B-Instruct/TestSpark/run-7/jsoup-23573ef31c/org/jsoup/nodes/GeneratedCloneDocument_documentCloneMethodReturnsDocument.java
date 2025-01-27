package org.jsoup.nodes;

public class GeneratedCloneDocument_documentCloneMethodReturnsDocument {

    @Test
    public void cloneDocument_documentCloneMethodReturnsDocument() {
        Document expectedDocument = mock(Document.class);
        when(expectedDocument.toString()).thenReturn("<html><body></body></html>");
        Document document = new Document("");
        assertEquals(expectedDocument, document.clone());
    }

}