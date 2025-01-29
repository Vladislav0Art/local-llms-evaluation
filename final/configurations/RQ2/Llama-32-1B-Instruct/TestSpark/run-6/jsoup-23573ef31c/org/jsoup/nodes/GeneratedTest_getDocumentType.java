package org.jsoup.nodes;

public class GeneratedTest_getDocumentType {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_getDocumentType() {
        String cssQuery = "/path/to/test/css";
        FormElement formElement = createFormElement(cssQuery, BASE_URI);
        Document document = new Document(BASE_URI).expectForm(formElement);
        assertEquals("text/html", document.documentType());
    }

}