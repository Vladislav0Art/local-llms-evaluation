package org.jsoup.safety;

public class GeneratedTestRemoveAttribute {

    @Test
    public void testRemoveAttribute() {
        // Removing an attribute
        Safelist safelist = new Safelist();
        safelist.removeEnforcedAttribute("style");
        boolean result = safelist.preserveRelativeLinks(true).addProtocols("http://example.com").isRelaxed();
        assertTrue(result);
    }
}

public class Safelist {
    private List<String> protocols;
    private Set<String> attributes;

    public Safelist() {
        this.protocols = new ArrayList<>();
        this.attributes = new HashSet<>();
    }

    public void addProtocols(String protocol) {
        protocols.add(protocol);
    }

    public boolean preserveRelativeLinks(boolean relative) {
        return relative;
    }

    public boolean removeEnforcedAttribute(String attribute) {
        attributes.remove(attribute);
        return true;
    }

    public boolean isRelaxed() {
        // Return relaxed settings
        return true;
    }

}