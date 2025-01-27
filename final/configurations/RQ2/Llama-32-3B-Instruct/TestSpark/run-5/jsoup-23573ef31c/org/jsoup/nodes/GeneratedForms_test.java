package org.jsoup.nodes;

public class GeneratedForms_test {

    @Test
    public void forms_test() {
        Document document = new Document("http://example.com");
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

}