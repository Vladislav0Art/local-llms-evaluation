package org.jsoup.nodes;

public class GeneratedShallowCloneDocument_documentShallowCloneMethodReturnsDocument {

    @Test
    public void shallowCloneDocument_documentShallowCloneMethodReturnsDocument() {
        Document expectedDocument = mock(Document.class);
        when(expectedDocument.toString()).thenReturn("<html><body></body></html>");
        Document document = new Document("");
        assertEquals(expectedDocument, document.shallowClone());
    }

}