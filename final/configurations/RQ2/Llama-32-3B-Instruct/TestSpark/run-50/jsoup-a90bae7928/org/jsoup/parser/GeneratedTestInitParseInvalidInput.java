package org.jsoup.parser;

public class GeneratedTestInitParseInvalidInput {

    @Mock
    private Reader inputReader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Mock
    private ParseSettings parseSettings;

    public void setup() {
    }

    @Test
    public void testInitParseInvalidInput() {
        boolean result = initialiseParse(inputReader, baseUri, parser);
        assertFalse(result);
    }

}