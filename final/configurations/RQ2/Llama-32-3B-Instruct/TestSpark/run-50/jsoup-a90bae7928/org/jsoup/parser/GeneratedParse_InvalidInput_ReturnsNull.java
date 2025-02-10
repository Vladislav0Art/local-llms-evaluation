package org.jsoup.parser;

public class GeneratedParse_InvalidInput_ReturnsNull {

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
    public void parse_InvalidInput_ReturnsNull() {
        Document document = null;
        when(parser.parse(parseSettings)).thenReturn(document);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document result = xmlTreeBuilder.parse(inputReader, baseUri);
        assertNull(result);
    }

}