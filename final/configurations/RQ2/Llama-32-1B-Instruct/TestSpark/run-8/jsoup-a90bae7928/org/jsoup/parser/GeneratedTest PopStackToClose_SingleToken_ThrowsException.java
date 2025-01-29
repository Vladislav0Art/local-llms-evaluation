package org.jsoup.parser;

public class GeneratedTest PopStackToClose_SingleToken_ThrowsException {

    @Mock
    private Document parseSettings;

    @InjectMocks
    private XmlTreeBuilder xmlTreeBuilder;

    @Before
    public void setup() {
        when(parseSettings.defaultSettings()).thenReturn(new ParseSettings());
    }

    @Test
    public void test

    PopStackToClose_SingleToken_ThrowsException() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment(new StringReader("Hello World"), "http://example.com", new Parser());
        assertThrows(NullPointerException.class, () -> xmlTreeBuilder.popStackToClose(xmlTreeBuilder.newNode(Token.StartTag()));
    }

}