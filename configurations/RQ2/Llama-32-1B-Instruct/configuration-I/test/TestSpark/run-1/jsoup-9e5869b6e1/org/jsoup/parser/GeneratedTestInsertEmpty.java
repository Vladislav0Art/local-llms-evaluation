package org.jsoup.parser;

public class GeneratedTestInsertEmpty {

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
    public void testInsertEmpty() {
        // Test the insert method with an empty tag
        Element element = new Element("<p></p>");
        underTest.insert(element);
        assertEquals(1, underTest - State.getStack().size());
        assertEquals("", underTest - State.getStack().get(0).getValue());
    }

}