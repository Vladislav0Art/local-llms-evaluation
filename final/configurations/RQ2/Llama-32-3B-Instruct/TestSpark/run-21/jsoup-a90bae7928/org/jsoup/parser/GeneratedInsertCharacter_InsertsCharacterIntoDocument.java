package org.jsoup.parser;

public class GeneratedInsertCharacter_InsertsCharacterIntoDocument {

    private static String baseUri = "https://example.com";

    public void testParse() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<xml><foo>bar</foo></xml>");
        Document document = builder.parse(input, baseUri);
        Assert.assertNotNull(document);
    }

    @Test
    public void insertCharacter_InsertsCharacterIntoDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Token.tokenType, "a";
        Document document = builder.insertToken(token);
        ListTextNode > textNodes = new ArrayList<>();
        for (org.jsoup.nodes.Node node : document.childNodes()) {
            if (node instanceof org.jsoup.nodes.TextNode) {
                textNodes.add((org.jsoup.nodes.TextNode) node);
            }
        }
        Assert.assertEquals(1, textNodes.size());
    }

}