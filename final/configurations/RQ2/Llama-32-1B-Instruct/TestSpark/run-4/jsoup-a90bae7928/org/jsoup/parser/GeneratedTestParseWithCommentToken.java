package org.jsoup.parser;

public class GeneratedTestParseWithCommentToken {

    @Test
    public void testParseWithCommentToken() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Document parsedDocument = treeBuilder.parse(inputFragment, baseUri);
        Assert.assertNotNull(parsedDocument);
    }

}