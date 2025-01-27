package org.jsoup.nodes;

public class GeneratedTestTitle {

    @Test
    public void testTitle() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        String title = form.title();
        assertNotNull(title);
    }

}