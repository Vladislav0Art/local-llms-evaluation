package org.jsoup.parser;

public class GeneratedTestProcessValidToken {

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
    public void testProcessValidToken() {
        boolean result = process(inputReader, parser);
        assertTrue(result);
    }

}