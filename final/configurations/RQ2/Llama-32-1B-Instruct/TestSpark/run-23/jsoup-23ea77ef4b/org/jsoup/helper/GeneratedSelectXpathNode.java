package org.jsoup.helper;

public class GeneratedSelectXpathNode {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void selectXpathNode() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        NodeList nodeList = w3cdom.selectXpath("//div", doc);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(doc.getElementsByTagName("body"))), nodeList);
    }

}