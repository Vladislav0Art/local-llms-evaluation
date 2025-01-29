package org.jsoup.parser;

public class GeneratedTestPopStackToClose {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestPopStackToClose() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        verifyInsertion(10, "a");
    }

    private void verifyInsertion(int index, String node) {
        if (index < xmlNodeList.length()) {
            Node nodeToVerify = xmlNodeList.charAt(index).trim();
            assertEquals(node, nodeToVerify);
        } else {
            fail("Unexpected node found at index %d", index);
        }
    }

}