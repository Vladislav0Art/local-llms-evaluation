package org.jsoup.safety;

public class GeneratedTest {

    public static final String[] safeTags = {"p", "span"};
    private Set<String> enforcedAttributes = new HashSet<>();

    public Safelist none() {
        return this;
    }

    public Safelist simpleText() {
        return this;
    }

    public Safelist withEnforcedAttribute(String element, String attribute, Object value) {
        enforcedAttributes.add(element + ":" + attribute + "=" + value);
        return this;
    }

    public Set<String> enforcedAttributes() {
        return enforcedAttributes;
    }

    public String[] safeTags() {
        return safeTags;
    }
}

public class SafelistTest {

    @Test
    public void none() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
    }

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("table"));
    }

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeAttribute("br", null, null));
    }

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("table"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("script"));
    }

}