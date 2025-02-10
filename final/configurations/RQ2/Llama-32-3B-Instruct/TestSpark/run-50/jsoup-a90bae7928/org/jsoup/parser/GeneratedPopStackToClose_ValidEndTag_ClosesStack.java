package org.jsoup.parser;

public class GeneratedPopStackToClose_ValidEndTag_ClosesStack {

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
    public void popStackToClose_ValidEndTag_ClosesStack() {
        when(parser.pop()).thenReturn(true);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.popStackToClose(Token.END_TAG);
    }

}