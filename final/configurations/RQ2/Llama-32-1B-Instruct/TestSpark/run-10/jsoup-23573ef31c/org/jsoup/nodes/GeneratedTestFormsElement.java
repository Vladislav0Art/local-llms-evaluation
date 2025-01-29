package org.jsoup.nodes;

public class GeneratedTestFormsElement {

    @Test
    public void testFormsElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

}