package org.jsoup.nodes;

public class GeneratedTest_expectForm {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_expectForm() {
        FormElement formElement = createFormElement(CSS_QUERY, BASE_URI);
        Document document = new Document(BASE_URI).expectForm(formElement);
        assertEquals("text/html", document.documentType());
    }

    private static FormElement createFormElement(String cssQuery, String baseUri) {
        return new FormElement(BASE_URI, cssQuery);
    }

}