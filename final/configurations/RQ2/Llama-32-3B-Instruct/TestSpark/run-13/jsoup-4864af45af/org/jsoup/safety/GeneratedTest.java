package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void testRelaxed() {
        // Relaxed settings
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        safelist.removeEnforcedAttribute("style");
        boolean result = safelist.preserveRelativeLinks(true).removeProtocols("https://example.com").isRelaxed();
        assertTrue(result);
    }

    @Test
    public void testPreserved() {
        // Preserved settings
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        safelist.removeEnforcedAttribute("style");
        boolean result = safelist.preserveRelativeLinks(false).removeProtocols("https://example.com").isRelaxed();
        assertFalse(result);
    }

    @Test
    public void testAddProtocols() {
        // Adding protocols
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        boolean result = safelist.preserveRelativeLinks(true).addProtocols("https://example.com").isRelaxed();
        assertTrue(result);
    }

    @Test
    public void testRemoveProtocols() {
        // Removing protocols
        Safelist safelist = new Safelist();
        safelist.addProtocols("http://example.com");
        boolean result = safelist.preserveRelativeLinks(true).removeProtocols("https://example.com").isRelaxed();
        assertFalse(result);
    }

    @Test
    public void testAddAttribute() {
        // Adding an attribute
        Safelist safelist = new Safelist();
        safelist.removeEnforcedAttribute("style");
        boolean result = safelist.preserveRelativeLinks(true).addProtocols("http://example.com").isRelaxed();
        assertFalse(result);
    }

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