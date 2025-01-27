package org.jsoup.parser;

public class GeneratedParseFragment_ReturnsNodesWhenInputIsNotEmpty {

    private static String baseUri = "https://example.com";

    public void testParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        Document document = builder.parse(input, baseUri);
        Assert.assertNotNull(document);
    }

    @Test
    public void parseFragment_ReturnsNodesWhenInputIsNotEmpty() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String inputFragment = "<xml><foo>bar</foo></xml>";
        Document document = builder.parseFragment(inputFragment, baseUri, new Parser());
        List<Node> nodes = new ArrayList<>();
        for (org.jsoup.nodes.Node node : document.childNodes()) {
            if (node instanceof org.jsoup.nodes.TextNode) {
                nodes.add(node);
            }
        }
        Assert.isNotEmpty(nodes);
    }

}