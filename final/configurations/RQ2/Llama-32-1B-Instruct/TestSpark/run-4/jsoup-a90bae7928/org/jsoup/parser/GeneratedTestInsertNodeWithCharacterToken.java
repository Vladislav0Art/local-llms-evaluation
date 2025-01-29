package org.jsoup.parser;

public class GeneratedTestInsertNodeWithCharacterToken {

    @Test
    public void testInsertNodeWithCharacterToken() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Token token = new Token(Token.Type.CHARACTER, "Hello World!");
        element.addToken(token);
        Element parsedElement = (Element) treeBuilder.parse(inputFragment, baseUri).getElement("a");
        Assert.assertNotNull(parsedElement);
    }

}