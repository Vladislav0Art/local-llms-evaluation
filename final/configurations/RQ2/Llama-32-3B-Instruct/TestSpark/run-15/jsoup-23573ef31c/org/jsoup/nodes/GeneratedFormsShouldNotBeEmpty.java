package org.jsoup.nodes;

public class GeneratedFormsShouldNotBeEmpty {

    @Test
    public void formsShouldNotBeEmpty() {
        Document document = Document.createShell("https://example.com");
        List<FormElement> forms = document.forms();
        assertFalse(forms.isEmpty());
    }

}