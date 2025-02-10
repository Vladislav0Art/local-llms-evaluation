package org.jsoup.parser;

public class GeneratedTestParseFragmentValidInput {

    @Mock
    private Reader inputReader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Mock
    private ParseSettings parseSettings;

    public void setup() {
    }

    @Test
    public void testParseFragmentValidInput() {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Element("node"));
        assertList(nodes);
    }

}