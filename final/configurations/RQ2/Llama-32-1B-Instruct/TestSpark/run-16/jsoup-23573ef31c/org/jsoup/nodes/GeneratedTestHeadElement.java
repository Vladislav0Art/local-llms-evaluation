package org.jsoup.nodes;

public class GeneratedTestHeadElement {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testHeadElement() {
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

}