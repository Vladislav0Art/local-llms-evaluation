package org.jsoup.parser;

public class GeneratedTestParseFragment_WithContextAndBaseUri {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testParseFragment_WithContextAndBaseUri() {
        Document document = parseFragment("example", "http://example.com", new Parser());
        assertXmlTreeBuilder(treeBuilder).parse(document, new Element("tag"));
        Assert.assertNotNull(document);
        Assert.assertTrue(document.hasStartTag());
        Assert.assertEquals("tag", document.getStartTag().getTextContent());
    }

}