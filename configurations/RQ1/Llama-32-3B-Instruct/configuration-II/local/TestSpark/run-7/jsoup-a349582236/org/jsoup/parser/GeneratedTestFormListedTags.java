package org.jsoup.parser;

public class GeneratedTestFormListedTags {

    @Test
    public void testFormListedTags() {
        Tag tag = new Tag("test");
        tag.formList = true;
        assertTrue(tag.formList());
    }

}