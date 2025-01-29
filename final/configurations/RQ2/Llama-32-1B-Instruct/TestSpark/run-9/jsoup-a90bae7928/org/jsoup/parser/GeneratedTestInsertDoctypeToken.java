package org.jsoup.parser;

public class GeneratedTestInsertDoctypeToken {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestInsertDoctypeToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token.Doctype("doctype"));
        verifyInsertion(10, "doctype");
    }

}