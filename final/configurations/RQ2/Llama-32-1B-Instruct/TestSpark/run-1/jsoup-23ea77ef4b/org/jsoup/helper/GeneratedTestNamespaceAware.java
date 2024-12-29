package org.jsoup.helper;

public class GeneratedTestNamespaceAware {

    @Test
    public void testNamespaceAware() {
        W3CDom instance = new W3CDom();
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        assert instance.namespaceAware(document);
    }

}