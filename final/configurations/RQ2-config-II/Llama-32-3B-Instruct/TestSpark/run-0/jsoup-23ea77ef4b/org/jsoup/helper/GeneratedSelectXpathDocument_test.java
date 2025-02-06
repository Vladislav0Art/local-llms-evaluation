package org.jsoup.helper;

public class GeneratedSelectXpathDocument_test {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void selectXpathDocument_test() {
        NodeList nodeList = DOC.getElementsByTagName("test");
        NodeList expectedNodeList = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            org.w3c.dom.Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                expectedNodeList.add((org.w3c.dom.Element) node);
            }
        }
        NodeList actualNodeList = W3CDom.selectXpath("test", DOC);
        assertEquals(expectedNodeList, actualNodeList);
    }

}