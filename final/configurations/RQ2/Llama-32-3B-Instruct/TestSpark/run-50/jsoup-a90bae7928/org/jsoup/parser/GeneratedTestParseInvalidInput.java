package org.jsoup.parser;

public class GeneratedTestParseInvalidInput {

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
    public void testParseInvalidInput() {
        Document document = null;
        assertDocument(document);
    }

}