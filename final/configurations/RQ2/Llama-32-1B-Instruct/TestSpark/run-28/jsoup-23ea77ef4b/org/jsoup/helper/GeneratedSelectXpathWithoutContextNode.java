package org.jsoup.helper;

public class GeneratedSelectXpathWithoutContextNode {

    @Test
    public void selectXpathWithoutContextNode() {
        org.jsoup.nodes.Document doc = new Document();
        NodeList nodeList = org.jsoup.helper.W3CDom.selectXpath("p", doc);
        assertEquals(1, nodeList.getLength());
    }

}