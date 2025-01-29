package org.jsoup.helper;

public class GeneratedTestNamespaceAwareProperties {

    @Test
    public void testNamespaceAwareProperties() {
        Properties properties = new HashMap<>();
        properties.put("http://example.com", "namespace");
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("xmlns:", "namespace");
        expectedMap.put("href:", "http://example.com");
        Assert.assertTrue(properties.equals(W3CDom.propertiesFromMap(expectedMap)));
    }

}