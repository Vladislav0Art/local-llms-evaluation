package org.jsoup.parser;

public class GeneratedTestParse_StartTag {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testParse_StartTag() {
        Document document = assertXmlTreeBuilder(treeBuilder).parse("example", "http://example.com");
        Assert.assertNotNull(document);
        Assert.assertTrue(document.hasStartTag());
        Assert.assertEquals("example", document.getStartTag().getTextContent());
    }

}