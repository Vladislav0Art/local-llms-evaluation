package org.jsoup.safety;

public class GeneratedTestSafelist {

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
    public void testSafelist() {
        Safelist safelist = Safelist.none();
        String[] expectedSafeTags = new String[]{"p", "span"};
        assertArrayEquals(expectedSafeTags, safelist.safeTags());
        assertEquals(0, Safelist.enforcedAttributes.size());

        safelist = Safelist.simpleText();
        expectedSafeTags = new String[]{"p", "span"};
        assertArrayEquals(expectedSafeTags, safelist.safeTags());
    }

}