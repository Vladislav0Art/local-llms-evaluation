package org.jsoup.helper;

public class GeneratedNamespaceAwareWithEmptyMapAsNamespace {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAwareWithEmptyMapAsNamespace() {
        W3CDom w3cdom = new W3CDom();
        Map<String, String> map = new HashMap<>();
        map.put("namespace", "");
        Assert.assertTrue(w3cdom.namespaceAware(map));
    }

}