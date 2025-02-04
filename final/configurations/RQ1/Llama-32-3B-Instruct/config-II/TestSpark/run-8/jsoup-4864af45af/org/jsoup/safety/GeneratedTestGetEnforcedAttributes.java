package org.jsoup.safety;

public class GeneratedTestGetEnforcedAttributes {

    @Test
    public void testGetEnforcedAttributes() throws Exception {
        WebConfig config = new WebConfig();
        Element element = new Element("html");
        Attribute attribute = new Attribute("href", "#anchor");
        Attributes attributes = config.getEnforcedAttributes(All);
        assertTrue(attributes.hasKeyIgnoreCase("href"));
        assertEquals("#anchor", attributes.getValue("href"));
    }
}

public class Element {
    public String getAbsUrl(String key) throws Exception {
        // implement element's absUrl method
        return "";
    }

    public void setValue(String value) {
    }
}

public class Attribute {
    private final String key;
    private final String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKeyValue() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

}