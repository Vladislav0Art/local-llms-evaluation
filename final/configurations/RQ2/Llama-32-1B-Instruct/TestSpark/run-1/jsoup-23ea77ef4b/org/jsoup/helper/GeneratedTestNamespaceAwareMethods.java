package org.jsoup.helper;

public class GeneratedTestNamespaceAwareMethods {

    @Test
    public void testNamespaceAwareMethods() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        W3CDom.W3CDom convertMethod = () -> {
            return document;
        };
        assert instance.namespaceAware(convertMethod);
    }

}