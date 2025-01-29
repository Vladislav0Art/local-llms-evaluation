package org.jsoup.helper;

public class GeneratedNamespaceAwareStringProperties {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void namespaceAwareStringProperties() {
        String[] properties = {"namespace", "http://example.com"};
        w3cdom.propertiesFromMap(Arrays.asList(properties));
        Assertions.assertEquals("http://example.com", w3cdom.getNamespace());
    }

}