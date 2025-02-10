package org.jsoup.parser;

public class GeneratedInitialiseParse_InvalidInput_DoesNotInitialiseParser {

    @Mock
    private Reader inputReader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Mock
    private ParseSettings parseSettings;

    public XmlTreeBuilderTest() {
        when(inputReader.read()).thenReturn(1);
    }

    @Test
    public void initialiseParse_InvalidInput_DoesNotInitialiseParser() {
        when(parser.initialise(parseSettings)).thenReturn(false);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean result = xmlTreeBuilder.initialiseParse(inputReader, baseUri, parser);
        assertFalse(result);
    }

}