package org.jsoup.helper;

public class GeneratedConvert {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void convert() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assert w3cdom.convert(document);
    }

}