package org.jsoup.parser;

public class GeneratedTestParseFragmentWithToken {

    @Test
    public void testParseFragmentWithToken() {
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Token token = new Token(Token.Type.DOCTYPE, new XmlDeclaration(baseUri, "html"));
        List<Node> parsedNodes = (List<Node>) treeBuilder.parseFragment(inputFragment, baseUri);
        Assert.assertNotNull(parsedNodes);
    }

}