package org.jsoup.parser;

public class GeneratedParse_ValidInput_ReturnsDocument {

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
    public void parse_ValidInput_ReturnsDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new StringReader("<html></html>"));
        when(parser.parse(parseSettings)).thenReturn(document);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document result = xmlTreeBuilder.parse(inputReader, baseUri);
        assertNotNull(result);
    }

}