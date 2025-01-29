package org.jsoup.parser;

public class GeneratedTest Parse_SingleFragment_NoContext_ReturnsNodeWithParent {

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

    Parse_SingleFragment_NoContext_ReturnsNodeWithParent() {
        parseSettings.defaultSettings().setBaseUri("http://example.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment(new StringReader("Hello World"), "http://example.com", new Parser());
        assertEquals(1, nodes.size());
    }

}