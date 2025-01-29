package org.jsoup.parser;

public class GeneratedTestInsertNodeWithCommentToken {

    @Test
    public void testInsertNodeWithCommentToken() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Token commentToken = new Token(Token.Type.COMMENT, "<!-- Comment -->");
        element.addComment(commentToken);
        Element parsedElement = (Element) treeBuilder.parse(inputFragment, baseUri).getElement("a");
        Assert.assertNotNull(parsedElement);
    }

}