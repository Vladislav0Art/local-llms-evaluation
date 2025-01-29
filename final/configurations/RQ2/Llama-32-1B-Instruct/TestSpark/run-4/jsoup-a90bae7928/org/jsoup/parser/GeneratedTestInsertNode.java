package org.jsoup.parser;

public class GeneratedTestInsertNode {

    @Test
    public void testInsertNode() {
        Element element = new Element("a", "http://example.com");
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        Element parsedElement = (Element) treeBuilder.parse(inputFragment, baseUri).getElement("a");
        Assert.assertNotNull(parsedElement);
    }

}