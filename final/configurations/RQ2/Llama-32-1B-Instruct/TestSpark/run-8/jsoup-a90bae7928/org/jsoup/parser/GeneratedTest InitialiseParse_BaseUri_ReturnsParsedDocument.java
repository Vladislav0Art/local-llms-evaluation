package org.jsoup.parser;

public class GeneratedTest InitialiseParse_BaseUri_ReturnsParsedDocument {

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

    InitialiseParse_BaseUri_ReturnsParsedDocument() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        Document parsedDocument = xmlTreeBuilder.initialiseParse(new StringReader("Hello World"), "http://example.com", new Parser());
        assertEquals("Hello World", parsedDocument.toString());
    }

}