package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    @Test
    public void testExpectForm() throws Exception {
        String baseUri = "http://example.com";
        Document document = new DocumentDocument(baseUri);
        FormElement form = document.expectForm("test");
        assertNotNull(form);
    }

}