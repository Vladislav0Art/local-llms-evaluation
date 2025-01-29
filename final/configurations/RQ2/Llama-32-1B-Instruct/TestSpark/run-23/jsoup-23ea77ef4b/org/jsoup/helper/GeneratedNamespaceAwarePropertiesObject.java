package org.jsoup.helper;

public class GeneratedNamespaceAwarePropertiesObject {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void namespaceAwarePropertiesObject() {
        Properties properties = new Properties();
        properties.setProperty("namespace", "http://example.com");
        w3cdom.propertiesFromMap(properties);
        Assertions.assertEquals("http://example.com", w3cdom.getNamespace());
    }

}