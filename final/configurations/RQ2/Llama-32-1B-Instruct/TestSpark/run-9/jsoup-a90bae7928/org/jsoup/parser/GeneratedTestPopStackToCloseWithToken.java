package org.jsoup.parser;

public class GeneratedTestPopStackToCloseWithToken {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestPopStackToCloseWithToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token.StartTag("start"));
        verifyInsertion(10, "start");
        treeBuilder.popStackToClose(new Token.EndTag("end"));
        verifyInsertion(11, "end");
    }

}