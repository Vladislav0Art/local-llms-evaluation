package org.jsoup.nodes;

public class GeneratedTestForms {

    @Test
    public void testForms() {
        Document document = new Document("https://example.com");
        List<FormElement> forms = document.forms();
        assertEquals(1, forms.size());
        assertEquals(0, forms.get(0).childCount());
    }

}