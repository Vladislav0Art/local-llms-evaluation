package org.jsoup.parser;

public class GeneratedTestParseValidInput {

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
    public void testParseValidInput() {
        Document document = new Document();
        document.setDocument(parse(inputReader, baseUri));
        assertDocument(document);
    }

}