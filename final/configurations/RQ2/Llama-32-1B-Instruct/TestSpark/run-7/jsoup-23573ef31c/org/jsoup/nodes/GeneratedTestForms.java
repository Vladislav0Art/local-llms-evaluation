package org.jsoup.nodes;

public class GeneratedTestForms {

    private Document document;

    @Test
    public void testForms() {
        // Test forms method of Document class
        List<FormElement> expected = new ArrayList<>();
        FormElement form1 = new FormElement("form1");
        FormElement form2 = new FormElement("form2");
        expected.add(form1);
        expected.add(form2);
        document.forms().add(expected.get(0));
    }

}