package org.jsoup.safety;

public class GeneratedTestGetEnforcedAttributes {

    private Set<String> addedTags;

    public MockSafelist() {
    }

    @Override
    protected boolean isSafeTag(String tag) {
        return true; // Always safe
    }

    public void setAddedTags(Set<String> addedTags) {
        this.addedTags = addedTags;
    }

    public Set<String> getAddedTags() {
        if (addedTags == null) {
            addedTags = new HashSet<>();
        }
        return addedTags;
    }

    public String[] getRemovedTags() {
        return new String[0];
    }

    @Override
    public Attributes getEnforcedAttributes(String tag) {
        Attributes attributes = new Attributes();
        attributes.setAttribute("src", Collections.emptySet());
        if (tag.equals("testTag")) {
            attributes.setAttribute("src", Collections.singleton("value"));
        }
        return attributes;
    }
}

public class GeneratedTest {
    private MockSafelist safelist;

    public void setSafelist(MockSafelist safelist) {
        this.safelist = safelist;
    }

    @Before
    public void setUp() {
        safelist = new MockSafelist();
        safelist.setAddedTags(new HashSet<>());
    }

    @Test
    public void testGetEnforcedAttributes() {
        safelist.setAddedTags(new HashSet<>());
        Attributes attributes = Safelist.class.cast(safelist.getEnforcedAttributes("testTag"));
        assertEquals(1, attributes.getAttribute("src", null));
        assertNotEquals(0, attributes.getAttribute("src", Collections.emptySet()));
    }
}

public class Attributes {

    private String attribute;

    public void setAttribute(String attribute, Object value) {
        this.attribute = value.toString(); // Use toString()
    }

    public String getAttribute(String key, Set<Object> defaultSet) {
        return attribute;
    }

}