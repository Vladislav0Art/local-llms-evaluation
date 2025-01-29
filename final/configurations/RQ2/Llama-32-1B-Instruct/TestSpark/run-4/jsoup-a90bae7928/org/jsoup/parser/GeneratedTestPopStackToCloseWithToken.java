package org.jsoup.parser;

public class GeneratedTestPopStackToCloseWithToken {

    @Test
    public void testPopStackToCloseWithToken() {
        Document document = new Document();
        String inputFragment = "<!DOCTYPE html><body> <p /> </p></body>";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(document, baseUri);
        Token endTag = new Token(Token.Type.END_TAG, "a");
        Element parsedElement = (Element) treeBuilder.parse(inputFragment, baseUri).getElement("a");
        Assert.assertNotNull(parsedElement);
        Assert.assertTrue(treeBuilder.popStackToClose(endTag) == true);
    }

}