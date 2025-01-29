package org.jsoup.helper;

public class GeneratedNamespaceAwareMapToStringListWithBool {

    @Test
    public void namespaceAwareMapToStringListWithBool() throws Exception {
        Properties properties = new HashMap<>();
        properties.put("key", "value");
        org.jsoup.nodes.Document doc = org.jsoup.helper.W3CDom.convert(org.jsoup.nodes.DocumentFactory.newInstance().create(doc, properties));
        W3CDom.W3CDom.W3CDom namespaceAware = new org.jsoup.helper.W3CDom();
        System.out.println(namespaceAware.namespaceAware(true).namespaceAware(properties.get("key")));
    }

}