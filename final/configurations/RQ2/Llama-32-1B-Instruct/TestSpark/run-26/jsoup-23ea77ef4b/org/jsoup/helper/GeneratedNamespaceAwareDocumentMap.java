package org.jsoup.helper;

public class GeneratedNamespaceAwareDocumentMap {

    @Test
    public void namespaceAwareDocumentMap() throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Document doc = org.jsoup.helper.W3CDom.convert(org.jsoup.nodes.DocumentFactory.newInstance().create(doc, map));
        System.out.println(W3CDom.namespaceAware(true).namespaceAware(map.get("key")));
    }

}