package org.jsoup.nodes;

public class GeneratedExpectFormShouldReturnNotNullValue {

    @Test
    public void expectFormShouldReturnNotNullValue() {
        Document document = Document.createShell("https://example.com");
        FormElement form = document.expectForm("form");
        assertNotNull(form);
    }

}