package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    @Test
    public void testExpectForm() {
        Document document = createShell("https://example.com");
        FormElement form = document.expectForm("#myForm");
        assertNotNull(form);
        assertEquals("#myForm", form.tagName());
    }

}