package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testLocation() {
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void testConnection() {
        assertEquals(null, document.connection().toString());
    }

    @Test
    public void testDocumentType() {
        Document document2 = document.createShell("https://example.com");
        assertEquals(document.documentType(), document2.documentType());
    }

    @Test
    public void testHeadElement() {
        Element head = document.head();
        assertEquals(0, (int) ((java.lang.Long) head.attributes().get(0).getValue()));
    }

    @Test
    public void testBodyElement() {
        Element body = document.body();
        assertEquals(1, (int) ((java.lang.Long) body.attributes().size()));
    }

    @Test
    public void testForms() {
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

    @Test
    public void testExpectForm() {
        FormElement form = new FormElement("test");
        assertEquals(form, document.expectForm("test"));
    }

    @Test
    public void testTitle() {
        assertEquals("", document.title());
        document.title("Hello World");
        assertEquals("Hello World", document.title());
    }

    @Test
    public void testCreateElement() {
        Element element = new Document(document).createElement("div");
        assertEquals(1, (int) ((java.lang.Long) element.attributes().size()));
    }
}

class FormElementTests {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com/form");
    }

    @Test
    public void testCreateFormElement() {
        FormElement form = new FormElement("test");
        assertEquals(form, document.expectForm("test"));
    }
}

class OutputSettingsTests {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = document.outputSettings();
        assertEquals(null, outputSettings.toString());
    }
}

class DocumentParserTests {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testParser() {
        Parser parser = document.parser();
        assertEquals(document, parser);
    }

}