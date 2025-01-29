package org.jsoup.parser;

public class GeneratedTestParseFragment_WithParser {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testParseFragment_WithParser() {
        Document document = parseFragment("example", "http://example.com", new Parser());
        assertXmlTreeBuilder(treeBuilder).parse(document, document);
    }

}