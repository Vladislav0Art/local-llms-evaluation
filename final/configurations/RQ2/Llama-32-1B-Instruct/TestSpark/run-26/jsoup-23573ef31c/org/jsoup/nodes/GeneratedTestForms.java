package org.jsoup.nodes;

public class GeneratedTestForms {

    @Test
    public void testForms() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

}