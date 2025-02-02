package org.jsoup.parser;

public class GeneratedTestGetEmptyTags {

    // Tests

    @Test
    public void testGetEmptyTags() {
        List<Tag> emptyTags = Tag.emptyTags;
        Assert.assertTrue(emptyTags.contains(Tag.tags.get("meta")));
        Assert.assertTrue(emptyTags.contains(Tag.tags.get("link")));
    }

}