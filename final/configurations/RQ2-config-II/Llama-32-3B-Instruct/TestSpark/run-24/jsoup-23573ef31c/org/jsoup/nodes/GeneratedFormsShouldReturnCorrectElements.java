package org.jsoup.nodes;

public class GeneratedFormsShouldReturnCorrectElements {

    @Test
    public void formsShouldReturnCorrectElements() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
        assertTrue(!forms.isEmpty());
        for (FormElement form : forms) {
            assertEquals("form", form.nodeName());
        }
    }

}