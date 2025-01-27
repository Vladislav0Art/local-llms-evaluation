package org.jsoup.helper;

public class GeneratedTestDocumentCreation {

    @Test
    public void testDocumentCreation() {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document();
        // add elements to the document
        org.jsoup.nodes.Element div = document.createElement("div");
        document.appendChild(div);
        // assert that the document was created correctly
        assertEquals(1, document.childNodes().size());
    }

}