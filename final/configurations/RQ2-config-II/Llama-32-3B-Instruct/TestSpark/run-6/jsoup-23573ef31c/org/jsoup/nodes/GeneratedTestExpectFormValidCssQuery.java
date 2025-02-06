package org.jsoup.nodes;

public class GeneratedTestExpectFormValidCssQuery {

    @Test
    public void testExpectFormValidCssQuery() {
        Document document = new Document("");
        FormElement form = document.expectForm("*");
        assertNotNull(form);
    }

}