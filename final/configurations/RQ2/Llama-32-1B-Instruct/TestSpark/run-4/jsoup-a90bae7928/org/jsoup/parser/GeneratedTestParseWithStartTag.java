package org.jsoup.parser;

public class GeneratedTestParseWithStartTag {

    @Test
    public void testParseWithStartTag() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Document parsedDocument = treeBuilder.parse(inputFragment, baseUri);
        Assert.assertNotNull(parsedDocument);
    }

}