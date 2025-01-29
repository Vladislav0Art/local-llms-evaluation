package org.jsoup.nodes;

public class GeneratedExpectForm {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void expectForm() throws Exception {
        Document doc = createDocument(BASE_URI);
        FormElement form = doc.expectForm("form");
        assertNotNull(form);
    }

}