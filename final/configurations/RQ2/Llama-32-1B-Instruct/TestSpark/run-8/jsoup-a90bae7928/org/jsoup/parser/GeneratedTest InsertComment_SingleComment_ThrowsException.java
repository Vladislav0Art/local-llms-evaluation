package org.jsoup.parser;

public class GeneratedTest InsertComment_SingleComment_ThrowsException {

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

    InsertComment_SingleComment_ThrowsException() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment(new StringReader("Hello World"), "http://example.com", new Parser());
        assertThrows(NullPointerException.class, () -> xmlTreeBuilder.insert(xmlTreeBuilder.newNode(Token.Comment()).insertToken(Token.Character()));
    }

}