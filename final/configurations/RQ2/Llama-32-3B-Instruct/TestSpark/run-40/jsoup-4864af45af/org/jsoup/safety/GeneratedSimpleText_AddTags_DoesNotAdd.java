package org.jsoup.safety;

public class GeneratedSimpleText_AddTags_DoesNotAdd {

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
    public void simpleText_AddTags_DoesNotAdd() {
        MockSafelist safelist = new MockSafelist();
        safelist.setAddedTags(new HashSet<>());
        String[] addedTags = safelist.getAddedTags();
        assertTrue(addedTags == null || addedTags.length == 0);
    }

}