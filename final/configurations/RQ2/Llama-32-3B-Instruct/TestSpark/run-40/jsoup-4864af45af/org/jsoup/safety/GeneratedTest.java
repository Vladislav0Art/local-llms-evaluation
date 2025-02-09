package org.jsoup.safety;

public class GeneratedTest {

    private Set<String> addedTags = new HashSet<>();

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

    @Before
    public void setUp() {
        safelist = new MockSafelist();
        safelist.setAddedTags(new HashSet<>());
    }

    @Before
    public void resetSafelist() {
        safelist = null;
    }

    @Test
    public void none_Safelist() {
        assertSame(Safelist.none(), Safelist.none());
    }

    @Test
    public void basic_AddTags_ReturnsCopy() {
        Safelist copy = Safelist.basic().addTags("tag1", "tag2");
        assertNotSame(Safelist.none(), copy);
    }

    @Test
    public void none_PreserveRelativeLinks_ReturnsNone() {
        assertSame(Safelist.none(), Safelist.none().preserveRelativeLinks(false));
    }

}