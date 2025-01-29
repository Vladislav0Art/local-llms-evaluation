package org.jsoup.parser;

public class GeneratedTestParseDoc {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestParseDoc() throws Exception {
        document = parseReader("input.xml", "http://example.com");
        assertXmlNodeListLength(5);
    }

}