package org.jsoup.helper;

public class GeneratedNamespaceAwareMapToString {

    @Test
    public void namespaceAwareMapToString() throws Exception {
        Properties properties = new HashMap<>();
        properties.put("key", "value");
        org.jsoup.nodes.Document doc = org.jsoup.helper.W3CDom.convert(org.jsoup.nodes.DocumentFactory.newInstance().create(doc, properties));
        System.out.println(W3CDom.namespaceAware(properties.get("key")));
    }

}