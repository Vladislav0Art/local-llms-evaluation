package org.jsoup.helper;

public class GeneratedTestConvertToDocumentAndSelectXpathWithContextNode {

    public static Document convertToDocument(String content) {
        Node node = new Node();
        node.setId("1");
        Document document = new Document();
        document.setContent(content);
        return document;
    }

    public static void selectXpath(List<String> xpaths, String contextNode) {
        for (String xpath : xpaths) {
            if (xpath.contains(contextNode)) {
                System.out.println(xpath);
            }
        }
    }

    @Test
    public void testConvertToDocumentAndSelectXpathWithContextNode() {
        String content = "Hello World!";
        Document document = ConvertToDocumentTest.convertToDocument(content);
        NodeListTest.addNode(document.getNode());
        assertEquals("2", NodeListTest.getNodes()); // select xpath returns node id with context node
    }

}