package org.jsoup.nodes;

public class GeneratedTestForms {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testForms() {
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

}