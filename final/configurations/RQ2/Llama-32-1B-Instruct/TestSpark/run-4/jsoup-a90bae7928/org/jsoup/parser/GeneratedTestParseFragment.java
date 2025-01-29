package org.jsoup.parser;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        String inputFragment = "<a />";
        String baseUri = "http://example.com";
        TreeBuilder treeBuilder = new XmlTreeBuilder(new Document(), baseUri);
        List<Node> parsedNodes = (List<Node>) treeBuilder.parseFragment(inputFragment, baseUri);
        Assert.assertNotNull(parsedNodes);
    }

}