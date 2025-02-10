package org.jsoup.parser;

public class GeneratedParseFragment_ValidInput_ReturnsNodes {

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
    public void parseFragment_ValidInput_ReturnsNodes() {
        List<Node> nodes = List.of(TextNodeFactory.newInstance().createTextNode("text"));
        when(parser.parseFragment(parseSettings)).thenReturn(nodes);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> result = xmlTreeBuilder.parseFragment(inputReader, baseUri, parser);
        assertEquals(nodes, result);
    }

}