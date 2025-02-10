package org.jsoup.parser;

public class GeneratedInitialiseParse_ValidInput_InitializesParser {

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
    public void initialiseParse_ValidInput_InitializesParser() {
        when(parser.initialise(parseSettings)).thenReturn(true);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean result = xmlTreeBuilder.initialiseParse(inputReader, baseUri, parser);
        assertTrue(result);
    }

}