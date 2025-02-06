package org.jsoup.nodes;

public class GeneratedExpectForm_DocumentReturnsExpectedFormElement {

    @Test
    public void expectForm_DocumentReturnsExpectedFormElement() {
        FormElement form = mock(FormElement.class);
        when(form.getCssQuery()).thenReturn("css query");
        Document document = new Document("https://example.com");
        assertEquals(form, document.expectForm("css query"));
    }

}