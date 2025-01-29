package org.jsoup.parser;

public class GeneratedTest InsertNode_SingleToken_UpdatesParent {

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

    InsertNode_SingleToken_UpdatesParent() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment(new StringReader("Hello World"), "http://example.com", new Parser());
        assertDoesNotThrow(() -> xmlTreeBuilder.insert(xmlTreeBuilder.newNode(Token.StartTag()).insertToken(Token.Character()));
    }

}