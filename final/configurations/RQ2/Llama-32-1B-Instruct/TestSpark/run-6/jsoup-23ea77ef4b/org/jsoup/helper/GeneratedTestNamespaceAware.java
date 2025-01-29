package org.jsoup.helper;

public class GeneratedTestNamespaceAware {

    @Test
    public void testNamespaceAware() {
        Properties properties = new HashMap<>();
        properties.put("http://example.com", "namespace");
        Properties expectedProperties = new HashMap<>();
        expectedProperties.put("xmlns:", "namespace");
        expectedProperties.put("href:", "http://example.com");
        W3CDom.W3CDom propertiesToUse = new W3CDom();
        Assert.assertTrue(properties.equals(propertiesToUse.namespaceAware(true)));
    }

}