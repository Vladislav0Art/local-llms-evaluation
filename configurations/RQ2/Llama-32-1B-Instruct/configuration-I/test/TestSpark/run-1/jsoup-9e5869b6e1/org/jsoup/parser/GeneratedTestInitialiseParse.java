package org.jsoup.parser;

public class GeneratedTestInitialiseParse {

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
    public void testInitialiseParse() {
        // Test the initialiseParse method
        underTest.initialiseParse(reader, baseUri, parser);
        assertNotNull(underTest - State.originalState());
        assertEquals(baseUri, underTest - State.originalState().getBaseUri());
    }

}