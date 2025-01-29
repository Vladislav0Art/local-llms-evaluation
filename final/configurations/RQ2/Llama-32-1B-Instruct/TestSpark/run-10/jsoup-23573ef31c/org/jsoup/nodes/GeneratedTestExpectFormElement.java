package org.jsoup.nodes;

public class GeneratedTestExpectFormElement {

    @Test
    public void testExpectFormElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        FormElement expectForm = document.expectForm("css");
        assertNotNull(expectForm);
        assertEquals("css", expectForm.cssQuery());
    }

}