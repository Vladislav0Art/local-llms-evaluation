package org.jsoup.helper;

public class GeneratedAsStringDocumentReturnsString {

    @Test
    public void asStringDocumentReturnsString() {
        Document doc = new Document();
        String result = W3CDom.asString(doc);
        assertEquals("root", result);
    }

}