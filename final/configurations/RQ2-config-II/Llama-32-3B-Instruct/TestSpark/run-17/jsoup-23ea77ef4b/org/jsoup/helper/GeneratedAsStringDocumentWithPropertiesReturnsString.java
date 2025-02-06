package org.jsoup.helper;

public class GeneratedAsStringDocumentWithPropertiesReturnsString {

    @Test
    public void asStringDocumentWithPropertiesReturnsString() {
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document();
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "html");
        assertEquals("html", W3CDom.asString(doc, properties));
    }

}