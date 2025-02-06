package org.jsoup.helper;

public class GeneratedSelectXpathStringWithDocumentReturnsNodeList {

    @Test
    public void selectXpathStringWithDocumentReturnsNodeList() {
        Document doc = new Document();
        NodeList nodeList = W3CDom.selectXpath("/root", doc);
        assertTrue(nodeList.size() > 0);
    }

}