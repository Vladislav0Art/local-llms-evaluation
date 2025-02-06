package org.jsoup.nodes;

public class GeneratedExpectFormShouldReturnCorrectElements {

    @Test
    public void expectFormShouldReturnCorrectElements() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        FormElement expectedForm = document.expectForm("div");
        assertNotNull(expectedForm);
        assertEquals("form", expectedForm.nodeName());
    }

}