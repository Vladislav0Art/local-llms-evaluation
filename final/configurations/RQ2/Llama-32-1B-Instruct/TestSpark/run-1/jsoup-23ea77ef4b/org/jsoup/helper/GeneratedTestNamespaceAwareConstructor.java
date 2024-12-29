package org.jsoup.helper;

public class GeneratedTestNamespaceAwareConstructor {

    @Test
    public void testNamespaceAwareConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        assert instance.namespaceAware(true);
    }

}