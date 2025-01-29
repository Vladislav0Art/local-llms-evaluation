package org.jsoup.parser;

public class GeneratedTest Parse_Fragment_NoBaseUri_ReturnsNodeAndChildrenWithChildren {

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

    Parse_Fragment_NoBaseUri_ReturnsNodeAndChildrenWithChildren() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        Document parsedDocument = xmlTreeBuilder.parse(new StringReader("Hello World"), "http://example.com");
        assertDoesNotThrow(() -> xmlTreeBuilder.insert(xmlTreeBuilder.newNode(Token.StartTag()).insertToken(Token.EndTag()).insertChild(xmlTreeBuilder.newNode(Token.Character()))));
    }

}