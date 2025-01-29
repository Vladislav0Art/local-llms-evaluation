package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    @Test
    public void testExpectForm() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        FormElement form = document.expectForm("testCssQuery");
        assertNotNull(form);
        assertEquals("testCssQuery", form.getCssQuery());
    }

}