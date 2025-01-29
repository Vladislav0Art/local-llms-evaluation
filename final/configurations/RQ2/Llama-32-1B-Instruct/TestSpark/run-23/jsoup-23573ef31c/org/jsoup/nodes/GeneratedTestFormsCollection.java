package org.jsoup.nodes;

public class GeneratedTestFormsCollection {

    @Test
    public void testFormsCollection() {
        List<FormElement> forms = document.forms();
        assertEquals(2, forms.size());
        FormElement firstForm = forms.get(0);
        assertNotNull(firstForm);
        assertEquals("form1", firstForm.getAttribute("name"));
        assertEquals("form1", firstForm.getAttribute("action"));
    }

}