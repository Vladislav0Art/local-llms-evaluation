package org.jsoup.nodes;

public class GeneratedBody_test2 {

    private Document document;

    @Before
    public void setup() {
        Document.createShell("http://example.com");
        document = new Document("http://example.com");
    }

    @Test
    public void body_test2() {
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
        document.forms().add(new FormElement("input"));
        assertEquals(1, forms.size());
    }

}