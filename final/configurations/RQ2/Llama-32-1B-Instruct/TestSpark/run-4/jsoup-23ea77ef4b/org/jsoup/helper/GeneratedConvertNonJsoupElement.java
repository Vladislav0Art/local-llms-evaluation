package org.jsoup.helper;

public class GeneratedConvertNonJsoupElement {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void convertNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        W3CDom w3cdom = new W3CDom();
        assert w3cdom.convert(element);
    }

}