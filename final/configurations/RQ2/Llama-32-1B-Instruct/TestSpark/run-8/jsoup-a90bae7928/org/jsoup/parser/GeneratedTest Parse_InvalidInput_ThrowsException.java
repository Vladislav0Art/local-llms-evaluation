package org.jsoup.parser;

public class GeneratedTest Parse_InvalidInput_ThrowsException {

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

    Parse_InvalidInput_ThrowsException() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        Document parsedDocument = xmlTreeBuilder.parse(new StringReader("Hello World"), "http://example.com");
        assertEquals(null, parsedDocument);
    }

}