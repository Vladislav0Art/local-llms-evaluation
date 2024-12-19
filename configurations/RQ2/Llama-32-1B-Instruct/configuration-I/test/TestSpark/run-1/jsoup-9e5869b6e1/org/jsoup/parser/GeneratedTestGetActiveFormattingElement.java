package org.jsoup.parser;

public class GeneratedTestGetActiveFormattingElement {

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
    public void testGetActiveFormattingElement() {
        // Test the getActiveFormattingElement method
        Element element = new Element("<span style=\"color: red\">Hello World!</span>");
        underTest.insert(element);
        assertEquals("Hello World!", element.getValue());
        assertEquals(0, underTest - State.getActiveFormattingElement("style").size());
    }

}