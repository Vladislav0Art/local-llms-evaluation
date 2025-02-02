package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTest {

    private Config config = new Config();

    @Test
    public void testIsSafeAttribute() {
        Element el = new Element();
        Attribute attr = new Attribute("href", "http://example.com");
        Assert.assertTrue(config.isSafeAttribute(All, el, attr));
    }

    @Test
    public void testIsSafeAttributeEnforced() {
        Element el = new Element();
        Attribute attr = new Attribute("href", "#anchor");
        Assert.assertTrue(config.isSafeAttribute("enforced", el, attr));
    }
}

class Config {

    private boolean preserveRelativeLinks;

    public void setPreserveRelativeLinks(boolean preserveRelativeLinks) {
        this.preserveRelativeLinks = preserveRelativeLinks;
    }

    public boolean isSafeAttribute(String tagName, Element el, Attribute attr) {
        // implementation
    }
}

class Element {
    public String absUrl(String key) {
        return "http://example.com";
    }
}

class Attribute {
    private final String name;
    private final String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getKey() {
        return name;
    }

    public String getValue() {
        return value;
    }
}

}