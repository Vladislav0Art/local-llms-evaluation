package org.jsoup.parser;

public class GeneratedTestInsertNodeWithDoctypeToken {

    @Test
    public void testInsertNodeWithDoctypeToken() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<!DOCTYPE html><body> <p /> </p></body>";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Token token = new Token(Token.Type.DOCTYPE, new XmlDeclaration(baseUri, "html"));
        element.addToken(token);
        Element parsedElement = (Element) treeBuilder.parse(inputFragment, baseUri).getElement("a");
        Assert.assertNotNull(parsedElement);
    }

}