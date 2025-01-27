package org.jsoup.nodes;

public class GeneratedTestEmptyForm {

    @Test
    public void testEmptyForm() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        assertFalse(form.isEmpty());
    }

}