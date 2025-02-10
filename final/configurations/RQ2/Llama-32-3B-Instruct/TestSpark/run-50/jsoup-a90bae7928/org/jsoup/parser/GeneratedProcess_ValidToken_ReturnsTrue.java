package org.jsoup.parser;

public class GeneratedProcess_ValidToken_ReturnsTrue {

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
    public void process_ValidToken_ReturnsTrue() {
        when(parser.process(parseSettings)).thenReturn(true);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean result = xmlTreeBuilder.process(Token.START_TAG);
        assertTrue(result);
    }

}