package org.jsoup.parser;

public class GeneratedTestParseFragment_WithoutBaseUri {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testParseFragment_WithoutBaseUri() {
        Document document = parseFragment("example", "", new Parser());
        assertXmlTreeBuilder(treeBuilder).parse(document, "").isEmpty();
    }

}