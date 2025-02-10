package org.jsoup.parser;

public class GeneratedInsertComment_ValidToken_InsertsComment {

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
    public void insertComment_ValidToken_InsertsComment() {
        when(parser.insert(parseSettings)).thenReturn(true);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(Token.COMMENT);
    }

}