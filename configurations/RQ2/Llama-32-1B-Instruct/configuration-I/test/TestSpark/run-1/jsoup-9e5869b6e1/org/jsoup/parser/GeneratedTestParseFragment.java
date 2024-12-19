package org.jsoup.parser;

public class GeneratedTestParseFragment {

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
    public void testParseFragment() {
        // Test the parseFragment method
        List<Node> nodes = underTest.parseFragment("Hello World!");
        assertEquals(1, nodes.size());
        assertEquals("Hello World!", nodes.get(0).getValue());
    }

}