package org.jsoup.nodes;

public class GeneratedTestExpectForm {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testExpectForm() {
        FormElement form = new FormElement("test");
        assertEquals(form, document.expectForm("test"));
    }

}