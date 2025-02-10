package org.jsoup.parser;

public class GeneratedProcess_InvalidToken_ReturnsFalse {

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
    public void process_InvalidToken_ReturnsFalse() {
        boolean result = xmlTreeBuilder.process(Token.CHARACTER).booleanValue();
        assertFalse(result);
    }

}