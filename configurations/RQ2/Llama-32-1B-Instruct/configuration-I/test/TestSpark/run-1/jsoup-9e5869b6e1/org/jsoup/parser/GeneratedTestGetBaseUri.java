package org.jsoup.parser;

public class GeneratedTestGetBaseUri {

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
    public void testGetBaseUri() {
        // Test the getBaseUri method
        String uri = underTest.getBaseUri();
        assertEquals("https://example.com", uri);
    }

}