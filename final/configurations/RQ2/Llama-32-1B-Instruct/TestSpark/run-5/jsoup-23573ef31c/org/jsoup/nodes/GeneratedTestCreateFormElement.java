package org.jsoup.nodes;

public class GeneratedTestCreateFormElement {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
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

}