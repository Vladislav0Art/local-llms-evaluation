package org.jsoup.helper;

public class GeneratedNamespaceAware_MultiplePropertiesMapTest {

    @Test
    public void namespaceAware_MultiplePropertiesMapTest() throws Exception {
        Properties props = new Properties();

        String[] properties = {"key1", "value1"};
        props.put("key2", "value2");
        doc.setProperty("property1", "value1");
        doc.setProperty("property2", "value2");

        boolean result1 = W3CDom.namespaceAware(true, props);
        boolean result2 = W3CDom.namespaceAware();

        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }

}