package org.jsoup.parser;

public class GeneratedTestInsertToken_WithoutEndTag {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testInsertToken_WithoutEndTag() {
        insertNode(new Element("tag"));
        Document document = assertXmlTreeBuilder(treeBuilder).parse("example", "http://example.com");
        Assert.assertNotNull(document);
        Assert.assertTrue(document.hasStartTag());
        Assert.assertEquals("tag", document.getStartTag().getTextContent());
    }

}