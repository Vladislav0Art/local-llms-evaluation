package org.jsoup.nodes;

public class GeneratedTestName {

    @Test
    public void testName() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        String name = form.name();
        assertFalse(name.isEmpty());
    }

}