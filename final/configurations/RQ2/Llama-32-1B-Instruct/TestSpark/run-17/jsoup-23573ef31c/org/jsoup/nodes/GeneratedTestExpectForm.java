package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    @Test
    public void testExpectForm() {
        Document document = new Document();
        String cssQuery = "test";
        FormElement form = document.expectForm(cssQuery);
        assertNotNull(form);
    }

}