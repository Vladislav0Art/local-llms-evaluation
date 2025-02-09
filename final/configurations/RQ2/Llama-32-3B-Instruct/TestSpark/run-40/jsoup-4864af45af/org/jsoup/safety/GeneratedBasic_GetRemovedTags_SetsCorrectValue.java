package org.jsoup.safety;

public class GeneratedBasic_GetRemovedTags_SetsCorrectValue {

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
    public void basic_GetRemovedTags_SetsCorrectValue() {
        MockSafelist safelist = new MockSafelist();
        safelist.setRemovedTags(new HashSet<>());
        String[] expected = {"testTag"};
        Safelist removedList = Safelist.class.cast(safelist.getRemovedTags());
        assertEquals(expected, removedList);
    }

}