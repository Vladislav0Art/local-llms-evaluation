package org.jsoup.helper;

public class GeneratedNamespaceAwareMap {

    private org.jsoup.nodes.Document document;

    @Test
    public void namespaceAwareMap() {
        Map<String, String> properties = new HashMap<>();
        properties.put("lang", "en");
        properties.put("charset", "UTF-8");
        document = org.jsoup.select.Document.parse("<!DOCTYPE html><html><head></head><body></body></html>");
        assertFalse(W3CDom.namespaceAware(properties));
        assertTrue(W3CDom.namespaceAware(Map.of("lang", "en")));
    }

}