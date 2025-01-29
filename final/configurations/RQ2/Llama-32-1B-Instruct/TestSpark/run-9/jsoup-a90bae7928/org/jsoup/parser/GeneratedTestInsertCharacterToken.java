package org.jsoup.parser;

public class GeneratedTestInsertCharacterToken {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestInsertCharacterToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token.Character("char"));
        verifyInsertion(10, "char");
    }

}