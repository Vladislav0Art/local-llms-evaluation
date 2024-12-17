package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestFormatInlineTag {

    private static Map<String, Tag> tags = new HashMap<>();

    @FunctionalInterface
    interface Tag {
        void register();

        boolean isBlock();

        boolean formatAsBlock();

        boolean preserveWhitespace();

        boolean formList();

        boolean formSubmit();
    }

    public static void generatePublicClasses() {
        for (String tagName : blockTags) {
            Tag tag = new Tag(tagName);
            register(tag);
        }
        for (String tagName : inlineTags) {
            Tag tag = new Tag(tagName);
            tag.isBlock = false;
            tag.formatAsBlock = false;
            register(tag);
        }

        // mods:
        for (String tagName : emptyTags) {
            Tag tag = tags.get(tagName);
            Validate.notNull(tag);
            tag.empty = true;
        }

        for (String tagName : formatAsInlineTags) {
            Tag tag = tags.get(tagName);
            Validate.notNull(tag);
            tag.formatAsBlock = false;
        }

        for (String tagName : preserveWhitespaceTags) {
            Tag tag = tags.get(tagName);
            Validate.notNull(tag);
            tag.preserveWhitespace = true;
        }

        for (String tagName : formListedTags) {
            Tag tag = tags.get(tagName);
            Validate.notNull(tag);
            tag.formList = true;
        }

        for (String tagName : formSubmitTags) {
            Tag tag = tags.get(tagName);
            Validate.notNull(tag);
            tag.formSubmit = true;
        }
    }

    public static void register(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    @Test
    public void testFormatInlineTag() {
        generatePublicClasses();
        Tag formatInlineTag = tags.get("b");
        assertTrue(formatInlineTag.formatAsBlock());
        assertFalse(formatInlineTag.preserveWhitespace());
    }

}