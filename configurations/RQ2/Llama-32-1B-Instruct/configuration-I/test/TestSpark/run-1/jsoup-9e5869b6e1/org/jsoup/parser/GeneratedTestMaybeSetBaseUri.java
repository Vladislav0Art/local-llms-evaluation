package org.jsoup.parser;

public class GeneratedTestMaybeSetBaseUri {

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
    public void testMaybeSetBaseUri() {
        // Test the maybeSetBaseUri method
        Element base = new Element("<base href=\"https://example.com\"/>");
        underTest.maybeSetBaseUri(base);
        assertTrue(underTest - State.originalState().getBaseUri().equals("https://example.com"));
    }

}