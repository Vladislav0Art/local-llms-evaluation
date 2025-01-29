package org.jsoup.helper;

public class GeneratedTestNamespaceAware_outputHtml {

    @Test
    public void testNamespaceAware_outputHtml() {
        Document doc = W3CDom.createDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put("lang", "en-US");
        doc.properties(properties);
        assertTrue(W3CDom.OutputHtml(doc, properties).containsKey("lang"));
    }

}