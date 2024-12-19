package org.jsoup.parser;

public class GeneratedTestInsertElement {

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
    public void testInsertElement() {
        // Test the insert method
        Element element = new Element("<p>Hello World!</p>");
        underTest.insert(element);
        assertEquals(1, underTest - State.getStack().size());
        assertEquals("Hello World!", underTest - State.getStack().get(0).getValue());
    }

}