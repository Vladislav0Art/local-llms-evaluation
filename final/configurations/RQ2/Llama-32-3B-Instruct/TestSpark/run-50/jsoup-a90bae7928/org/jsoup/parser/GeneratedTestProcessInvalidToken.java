package org.jsoup.parser;

public class GeneratedTestProcessInvalidToken {

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
    public void testProcessInvalidToken() {
        boolean result = process(inputReader, parser);
        assertFalse(result);
    }

}