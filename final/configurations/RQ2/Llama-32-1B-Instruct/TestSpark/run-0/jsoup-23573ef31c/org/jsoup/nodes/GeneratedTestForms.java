package org.jsoup.nodes;

public class GeneratedTestForms {

    @Test
    public void testForms() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        List<FormElement> forms = document.forms();
        assertEquals(5, forms.size());
    }

}