package org.jsoup.safety;

public class GeneratedBasic_GetEnforcedAttributes_SetsCorrectValue {

    private Set<String> addedTags;

    @Override
    protected boolean isSafeTag(String tag) {
        return true; // Always safe
    }

    public void setAddedTags(Set<String> addedTags) {
        this.addedTags = addedTags;
    }
}

public class GeneratedTest {

    @Test
    public void basic_GetEnforcedAttributes_SetsCorrectValue() {
        MockSafelist safelist = new MockSafelist();
        safelist.setAddedTags(new HashSet<>());
        Attributes attributes = Safelist.class.cast(safelist.getEnforcedAttributes("testTag"));
        assertEquals(1, attributes.getAttribute("src", null));
    }

}