package org.jsoup.parser;

public class GeneratedTestInitParse {

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
    public void testInitParse() {
        boolean result = initialiseParse(inputReader, baseUri, parser);
        assertTrue(result);
    }

}