package org.jsoup.parser;

public class GeneratedTestTemplateMode {

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
    public void testTemplateMode() {
        // Test the pushTemplateMode method
        underTest.pushTemplateMode(new HtmlTreeBuilderState());
        assertEquals(1, underTest - State.templateModeSize());
        assertEquals(underTest - State.templateMode(), underTest - State.currentTemplateMode());
    }

}