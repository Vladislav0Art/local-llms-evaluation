package org.jsoup.helper;

public class GeneratedTestSelectXpath {

    @Test
    public void testSelectXpath() {
        Document document = W3CDom.createDocument();
        NodeList nodeList = W3CDom.selectXpath("name[1]", document);
        assertTrue(nodeList.getLength() == 2);
        for (int i = 0; i < nodeList.getLength(); i++) {
            org.jsoup.nodes.Node node = nodeList.item(i);
            assertEquals(node.getNodeType(), Node.ELEMENT_NODE);
            if (node.getNodeName().equals("name")) {
                assertEquals(document.getDocumentElement().getNodeName(), "name");
            }
        }
    }

}