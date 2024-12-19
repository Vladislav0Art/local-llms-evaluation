package org.jsoup.parser;

public class GeneratedTestGetDocument {

    private HtmlTreeBuilder underTest;
    private Reader reader;
    private Parser parser;

    @Before
    public void setup() {
        // Initialize the test data
        String inputFragment = "Hello World!";
        String baseUri = "https://example.com";
        ParseSettings defaultSettings = new ParseSettings();
        underTest = new HtmlTreeBuilder(defaultSettings);
        reader = new Reader(inputFragment, baseUri, parser);
    }

    @Test
    public void testGetDocument() {
        // Test the getDocument method
        Document document = underTest.getDocument();
        assertNotNull(document);
        assertEquals("Hello World!", document.getValue());
    }

}