package org.jsoup.safety;

public class GeneratedAddTags_AddsTagsToSafelist {

    @Test
    public void addTags_AddsTagsToSafelist() {
        // Arrange
        String[] tags = {"tag1", "tag2"};
        Safelist safelist = Safelist.addTags(tags);

        // Act
        Safelist result = new Safelist(safelist);

        // Assert
        assertTrue(result.isSafeTag("tag1"));
        assertTrue(result.isSafeTag("tag2"));
    }

}