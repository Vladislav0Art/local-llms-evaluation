package org.jsoup.helper;

public class GeneratedSelectXpathNonJsoupElement {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void selectXpathNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        assertEquals(5, w3cdom.selectXpath("//div"));
    }

}