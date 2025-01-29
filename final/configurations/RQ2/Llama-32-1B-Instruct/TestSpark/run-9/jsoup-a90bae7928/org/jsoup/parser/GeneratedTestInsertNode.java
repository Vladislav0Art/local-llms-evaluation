package org.jsoup.parser;

public class GeneratedTestInsertNode {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestInsertNode() throws Exception {
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        verifyInsertion(10, null);
    }

    private void assertXmlNodeListLength(int length) {
        String xmlOutput = document.toString();
        if (xmlOutput.contains("<node>")) {
            expectedXmlNodeList = new ArrayList<>(Arrays.asList(new TagNode[]{
                    new AttrNode("<a>", 0, false, true),
                    new TextNode("text", 1),
                    new Node[]{}
            }));
        } else {
            expectedXmlNodeList = null;
        }
        assertEquals(length, expectedXmlNodeList.length());
    }

}