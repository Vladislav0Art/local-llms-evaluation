package org.jsoup.safety;

public class GeneratedTestProtocol {


    private Attributes attributes;
    private Map<TagName, Set<AttributeKey>> enforcedAttributes;
    private boolean preserveRelativeLinks;

    public Config() {
        this.attributes = new Attributes();
        this.enforcedAttributes = new HashMap<>();
        this.preserveRelativeLinks = false;
    }

    // getters and setters for attributes
    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Map<TagName, Set<AttributeKey>> getEnforcedAttributes() {
        return enforcedAttributes;
    }

    public void setEnforcedAttributes(Map<TagName, Set<AttributeKey>> enforcedAttributes) {
        this.enforcedAttributes = enforcedAttributes;
    }

    public boolean isPreserveRelativeLinks() {
        return preserveRelativeLinks;
    }

    public void setPreserveRelativeLinks(boolean preserveRelativeLinks) {
        this.preserveRelativeLinks = preserveRelativeLinks;
    }

    // getters and setters for protocols

}

public class TestConfig {

    @Test
    public void testProtocol() {
        Config config = new Config();
        config.preserveRelativeLinks = false;

        Element el = new Element("a");
        el.setAttribute("href", "http://example.com");

        Attribute attr = new Attribute("href", "");

        assertTrue(config.isSafeAttribute(All, el, attr));
    }

}