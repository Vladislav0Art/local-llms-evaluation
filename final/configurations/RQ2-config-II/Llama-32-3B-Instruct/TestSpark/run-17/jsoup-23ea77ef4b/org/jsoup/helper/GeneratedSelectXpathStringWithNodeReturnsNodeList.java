package org.jsoup.helper;

public class GeneratedSelectXpathStringWithNodeReturnsNodeList {

    @Test
    public void selectXpathStringWithNodeReturnsNodeList() {
        Node contextNode = new Node();
        NodeList nodeList = W3CDom.selectXpath("/root", contextNode);
        assertTrue(nodeList.size() > 0);
    }

}