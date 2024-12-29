package org.jsoup.helper;

public class GeneratedTestNamespaceAwareSelectXpath {

    @Test
    public void testNamespaceAwareSelectXpath() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        NodeList selectXpaths = instance.selectXpath("/*", document);
        assert selectXpaths.getLength() == 2;
    }

}