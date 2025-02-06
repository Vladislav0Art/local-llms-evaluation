package org.jsoup.safety;

public class GeneratedAddTags_AddTagsReturnsNewSafelistWithAddedTags {

    @Test
    public void addTags_AddTagsReturnsNewSafelistWithAddedTags() {
        Safelist safelist = Safelist.addTags("a", "b");
        assertEquals(2, safelist.getSafeTags().size());
    }

}