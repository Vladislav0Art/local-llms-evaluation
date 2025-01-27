package org.jsoup.safety;

public class GeneratedTestWithEnforcedAttribute {

    public static final String[] safeTags = {"p", "span"};
    private Set<String> enforcedAttributes = new HashSet<>();

    public Safelist none() {
        return this;
    }

    public Safelist simpleText() {
        return this;
    }

    public void withEnforcedAttribute(String element, String attribute, Object value) {
        enforcedAttributes.add(element + ":" + attribute + "=" + value);
    }

    public Set<String> enforcedAttributes() {
        return this.enforcedAttributes;
    }

    public String[] safeTags() {
        return safeTags;
    }
}

public class SafelistTest {

    @Test
    public void testWithEnforcedAttribute() {
        Safelist safelist = Safelist.none();
        safelist.withEnforcedAttribute("img", "src", "/image.jpg");
        assertEquals(1, Safelist.enforcedAttributes.size());
    }

}