package org.jsoup.parser;

public class GeneratedTestIsFragmentParsing {

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
    public void testIsFragmentParsing() {
        // Test the isFragmentParsing method
        assertFalse(underTest.isFragmentParsing());
        underTest.parseFragment("", "", "");
        assertTrue(underTest.isFragmentParsing());
    }

}