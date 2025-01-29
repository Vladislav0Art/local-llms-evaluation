package org.jsoup.parser;

public class GeneratedTest Parse_Fragment_NoBaseUri_ReturnsNode {

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

    Parse_Fragment_NoBaseUri_ReturnsNode() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        Document parsedDocument = xmlTreeBuilder.parse(new StringReader("Hello World"), "http://example.com");
        assertEquals(xmlTreeBuilder.newNode(Token.StartTag()), parsedDocument);
    }

}