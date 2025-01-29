package org.jsoup.nodes;

public class GeneratedTestExpectForm_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testExpectForm_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        FormElement form = document.expectForm("test");
        Assert.assertNotNull(form);
    }

}