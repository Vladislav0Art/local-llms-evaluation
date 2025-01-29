package org.jsoup.parser;

public class GeneratedTestParseWithDoctypeToken {

    @Test
    public void testParseWithDoctypeToken() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<!DOCTYPE html><body> <p /> </p></body>";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Document parsedDocument = treeBuilder.parse(inputFragment, baseUri);
        Assert.assertNotNull(parsedDocument);
    }

}