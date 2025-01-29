package org.jsoup.nodes;

public class GeneratedTestForms_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testForms_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

}