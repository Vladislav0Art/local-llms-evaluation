package org.jsoup.safety;

public class GeneratedBasic_GetAddedTags_SetsCorrectValue {

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
    public void basic_GetAddedTags_SetsCorrectValue() {
        MockSafelist safelist = new MockSafelist();
        safelist.setAddedTags(new HashSet<>());
        String[] expected = {"testTag"};
        Safelist addedList = Safelist.class.cast(safelist.getAddedTags());
        assertEquals(expected, addedList);
    }

}