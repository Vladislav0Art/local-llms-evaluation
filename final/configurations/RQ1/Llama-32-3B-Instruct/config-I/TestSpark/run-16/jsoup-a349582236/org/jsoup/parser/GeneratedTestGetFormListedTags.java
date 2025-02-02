package org.jsoup.parser;

public class GeneratedTestGetFormListedTags {

    // Tests

    @Test
    public void testGetFormListedTags() {
        List<Tag> formListedTags = Tag.formListedTags;
        Assert.assertTrue(formListedTags.contains(Tag.tags.get("button")));
        Assert.assertTrue(formListedTags.contains(Tag.tags.get("input")));
    }

}