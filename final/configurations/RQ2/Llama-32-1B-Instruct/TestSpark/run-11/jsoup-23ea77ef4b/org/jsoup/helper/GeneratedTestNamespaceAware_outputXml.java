package org.jsoup.helper;

public class GeneratedTestNamespaceAware_outputXml {

    @Test
    public void testNamespaceAware_outputXml() {
        Document doc = W3CDom.createDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put("lang", "en-US");
        doc.properties(properties);
        assertTrue(W3CDom.OutputXml(doc, properties).containsKey("lang"));
    }

}