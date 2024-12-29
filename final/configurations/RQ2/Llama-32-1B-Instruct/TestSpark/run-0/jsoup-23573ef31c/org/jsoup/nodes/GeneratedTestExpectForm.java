package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    @Test
    public void testExpectForm() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        FormElement form = document.expectForm("test");
        assertNotNull(form);
    }

}