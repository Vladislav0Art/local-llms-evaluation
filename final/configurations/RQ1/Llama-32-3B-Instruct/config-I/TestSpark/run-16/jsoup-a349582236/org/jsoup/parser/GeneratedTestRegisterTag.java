package org.jsoup.parser;

public class GeneratedTestRegisterTag {

    // Tests

    @Test
    public void testRegisterTag() {
        Tag tag = new Tag("test");
        Tag registeredTag = Tag.tags.get(tag.tagName);
        Assert.assertTrue(registeredTag.equals(tag));
    }

}