package org.jsoup.helper;

public class GeneratedTestNamespaceAwareSelectXpathConstructor {

    @Test
    public void testNamespaceAwareSelectXpathConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        NodeList selectXpaths = instance.selectXpath("/*", document);
        assert selectXpaths.getLength() == 2;
    }

}