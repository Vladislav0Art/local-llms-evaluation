package org.jsoup.parser;

public class GeneratedTestPushActiveFormattingElements {

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
    public void testPushActiveFormattingElements() {
        // Test the pushActiveFormattingElements method
        Element element = new Element("<span style=\"color: red\">Hello World!</span>");
        underTest.insert(element);
        assertEquals(1, underTest - State.getActiveFormattingElement("style").size());
        assertEquals("Hello World!", underTest - State.getActiveFormattingElement("style").get(0).getValue());
    }

}