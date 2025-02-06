package org.jsoup.safety;

public class GeneratedRemoveTags_RemovesTagsFromSafelist {

    @Test
    public void removeTags_RemovesTagsFromSafelist() {
        // Arrange
        String[] tags = {"tag1", "tag2"};
        Safelist safelist = Safelist.addTags(tags);
        Safelist result = Safelist.removeTags(tags);

        // Act

        // Assert
        assertFalse(result.isSafeTag("tag1"));
        assertTrue(result.isSafeTag("tag2"));
    }

}