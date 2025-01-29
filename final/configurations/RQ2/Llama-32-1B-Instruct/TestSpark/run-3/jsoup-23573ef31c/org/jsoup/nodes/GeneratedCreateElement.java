package org.jsoup.nodes;

public class GeneratedCreateElement {

    private static final String BASE_URI = "http://example.com";
    private Document document;

    @Before
    public void setup() {
        document = new Document(BASE_URI);
    }

    public Document createShell(String baseUri) {
        return new Document(createShell(baseUri));
    }

    public void expectForm(String cssQuery, String expected) {
        // implement expectations for form creation
    }

    public void titleTest(String title) {
        document.title(title);
        assertEquals(title, document.title());
    }

    public void headTest() {
        document.head();
        assertEquals(document.getHead(), document.head());
    }

    @Test
    public void createElement() {
        Element element = document.createElement("input");
        assertNotNull(element);
    }

}