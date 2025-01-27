package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        Element element = form.element();
        String text = document.text(element);
        assertNotNull(text);
    }

}