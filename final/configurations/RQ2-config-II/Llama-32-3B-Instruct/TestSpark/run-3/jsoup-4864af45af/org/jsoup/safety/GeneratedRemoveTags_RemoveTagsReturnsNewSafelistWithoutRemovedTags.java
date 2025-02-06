package org.jsoup.safety;

public class GeneratedRemoveTags_RemoveTagsReturnsNewSafelistWithoutRemovedTags {

    @Test
    public void removeTags_RemoveTagsReturnsNewSafelistWithoutRemovedTags() {
        Safelist safelist = new Safelist(Safelist.simpleText()).addTags("a", "b").removeTags("a");
        assertEquals(1, safelist.getSafeTags().size());
    }

}