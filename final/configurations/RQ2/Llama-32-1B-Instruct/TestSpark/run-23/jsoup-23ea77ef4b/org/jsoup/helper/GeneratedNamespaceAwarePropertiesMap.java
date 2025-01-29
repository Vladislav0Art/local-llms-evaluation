package org.jsoup.helper;

public class GeneratedNamespaceAwarePropertiesMap {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void namespaceAwarePropertiesMap() {
        Map<String, String> properties = new HashMap<>();
        properties.put("namespace", "http://example.com");
        w3cdom.propertiesFromMap(properties);
        Assertions.assertEquals("http://example.com", w3cdom.getNamespace());
    }

}