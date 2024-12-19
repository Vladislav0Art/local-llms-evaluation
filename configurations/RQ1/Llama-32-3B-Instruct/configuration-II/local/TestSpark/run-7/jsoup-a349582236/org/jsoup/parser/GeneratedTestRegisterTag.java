package org.jsoup.parser;

public class GeneratedTestRegisterTag {

    @Test
    public void testRegisterTag() {
        String tagName = "test";
        Tag tag = new Tag(tagName);
        Tag registeredTag = Tag.tags.get(tagName);
        assertNotNull(registeredTag);
    }

}