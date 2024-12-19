package org.jsoup.parser;

public class GeneratedTestIsFormListed {

    @Test
    public void testIsFormListed() {
        Tag tag = new TagImpl("input", true);
        assertTrue(tag.isFormListed());

        String tagName = "textarea";
        Tag valueOfTag = Tag.valueOf(tagName, null);
        assertFalse(valueOfTag.isFormListed());
    }

}