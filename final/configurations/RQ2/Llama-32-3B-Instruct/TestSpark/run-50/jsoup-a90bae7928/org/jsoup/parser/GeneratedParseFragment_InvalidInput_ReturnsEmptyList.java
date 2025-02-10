package org.jsoup.parser;

public class GeneratedParseFragment_InvalidInput_ReturnsEmptyList {

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
    public void parseFragment_InvalidInput_ReturnsEmptyList() {
        List<Node> nodes = List.of(TextNodeFactory.newInstance().createTextNode("text"));
        when(parser.parseFragment(parseSettings)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> result = xmlTreeBuilder.parseFragment(inputReader, baseUri, parser);
        assertEquals(0, result.size());
    }

}