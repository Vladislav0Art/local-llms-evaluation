package org.jsoup.parser;

public class GeneratedTestInsertNodeWithToken {

    @Test
    public void testInsertNodeWithToken() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Token token = new Token(Token.Type.DOCTYPE, new XmlDeclaration(baseUri, "html"));
        Element parsedElement = (Element) treeBuilder.parse(inputFragment, baseUri).getElement("a");
        Assert.assertNotNull(parsedElement);
    }

}