package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testExpectForm() {
        FormElement form = document.expectForm("name");
        assertNotNull(form);
    }

}