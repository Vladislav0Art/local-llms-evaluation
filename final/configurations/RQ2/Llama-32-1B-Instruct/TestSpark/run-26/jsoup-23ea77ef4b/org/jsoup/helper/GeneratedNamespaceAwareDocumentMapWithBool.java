package org.jsoup.helper;

public class GeneratedNamespaceAwareDocumentMapWithBool {

    @Test
    public void namespaceAwareDocumentMapWithBool() throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Document doc = org.jsoup.helper.W3CDom.convert(org.jsoup.nodes.DocumentFactory.newInstance().create(doc, map));
        W3CDom.W3CDom.W3CDom namespaceAware = new org.jsoup.helper.W3CDom();
        System.out.println(namespaceAware.namespaceAware(true).namespaceAware(map.get("key")));
    }

}