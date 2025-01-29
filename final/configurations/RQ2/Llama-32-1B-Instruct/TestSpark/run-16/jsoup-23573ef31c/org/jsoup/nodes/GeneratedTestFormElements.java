package org.jsoup.nodes;

public class GeneratedTestFormElements {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testFormElements() {
        List<FormElement> forms = document.forms();
        assertEquals(1, forms.size());
    }

}