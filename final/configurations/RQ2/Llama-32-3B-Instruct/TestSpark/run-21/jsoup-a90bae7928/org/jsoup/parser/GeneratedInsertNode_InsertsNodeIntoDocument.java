package org.jsoup.parser;

public class GeneratedInsertNode_InsertsNodeIntoDocument {

    private static String baseUri = "https://example.com";

    public void testParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        Document document = builder.parse(input, baseUri);
        Assert.assertNotNull(document);
    }

    @Test
    public void insertNode_InsertsNodeIntoDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Token.tokenType, "someValue";
        Document document = builder.insertToken(token);
        List<Node> nodes = new ArrayList<>();
        for (org.jsoup.nodes.Node node : document.childNodes()) {
            if (node instanceof org.jsoup.nodes.TextNode) {
                nodes.add(node);
            }
        }
        Assert.assertEquals(1, nodes.size());
    }

}