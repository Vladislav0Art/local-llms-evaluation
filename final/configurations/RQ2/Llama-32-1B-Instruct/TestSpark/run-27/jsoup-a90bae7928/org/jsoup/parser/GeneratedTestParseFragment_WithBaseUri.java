package org.jsoup.parser;

public class GeneratedTestParseFragment_WithBaseUri {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testParseFragment_WithBaseUri() {
        Document document = parseFragment("example", "http://example.com", "");
        Assert.assertNotNull(document);
        Assert.assertTrue(document.hasStartTag());
        Assert.assertEquals("example", document.getStartTag().getTextContent());
    }

}