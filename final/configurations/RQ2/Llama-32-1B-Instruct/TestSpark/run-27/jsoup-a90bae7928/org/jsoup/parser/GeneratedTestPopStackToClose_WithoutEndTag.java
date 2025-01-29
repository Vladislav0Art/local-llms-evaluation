package org.jsoup.parser;

public class GeneratedTestPopStackToClose_WithoutEndTag {

    @Mock
    private TreeBuilder treeBuilder;

    private Document parse(Reader input, String baseUri) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return parse(input, baseUri);
        }
    }

    @Test
    public void testPopStackToClose_WithoutEndTag() {
        insertNode(new Element("tag"));
        Document document = assertXmlTreeBuilder(treeBuilder).parse("example", "http://example.com");
        Assert.assertNotNull(document);
        Assert.assertTrue(document.hasStartTag());
        popStackToClose(new Token(Token.EndTag("tag")));
    }

}