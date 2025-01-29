package org.jsoup.parser;

public class GeneratedTestParse_WithoutStartTag {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testParse_WithoutStartTag() {
        assertXmlTreeBuilder(treeBuilder).parse("example", "http://example.com").isEmpty();
    }

}