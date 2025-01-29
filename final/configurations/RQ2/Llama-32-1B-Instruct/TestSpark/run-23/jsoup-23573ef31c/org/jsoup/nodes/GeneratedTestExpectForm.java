package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    @Test
    public void testExpectForm() {
        DocumentType type = document.documentType();
        String cssQuery = "form1";
        FormElement form = document.expectForm(cssQuery);
        assertNotNull(form);
        assertEquals("form1", form.getAttribute("name"));
        assertEquals("form1", form.getAttribute("action"));
        assertEquals(1, forms().size());
    }

}