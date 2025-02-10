package org.jsoup.parser;

public class GeneratedInsertElement_ValidStartTag_InsertsElement {

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
    public void insertElement_ValidStartTag_InsertsElement() {
        Element element = ElementFactory.newInstance().createElement("element");
        when(parser.insert(element)).thenReturn(true);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element result = xmlTreeBuilder.insert(Token.START_TAG);
        assertEquals(element, result);
    }

}