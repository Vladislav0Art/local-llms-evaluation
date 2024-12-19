package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private static final String[] EMPTY_TAG_LIST = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };

    @Test
    public void testRegisterEmptyTags() {
        Tag tag = new Tag("meta");
        System.out.println(tag);
        for (String tagName : EMPTY_TAG_LIST) {
            Validate.notNull(tags.get(tagName));
        }
    }

    @Test
    public void testRegisterFormatAsInlineTags() {
        Tag tag = new Tag("title");
        System.out.println(tag);
        for (String tagName : formatAsInlineTags) {
            Validate.notNull(tags.get(tagName));
        }
    }

    @Test
    public void testRegisterFormListedTags() {
        Tag tag = new Tag("button");
        System.out.println(tag);
        for (String tagName : formListedTags) {
            Validate.notNull(tags.get(tagName));
        }
    }

    @Test
    public void testRegisterFormSubmitTags() {
        Tag tag = new Tag("input");
        System.out.println(tag);
        for (String tagName : formSubmitTags) {
            Validate.notNull(tags.get(tagName));
        }
    }

    @Test
    public void testRegisterNonExistingTag() {
        Tag tag = new Tag("invalid-tag");
        System.out.println(tag);
        try {
            tags.get("invalid-tag");
            assert false;
        } catch (NoSuchElementException e) {
            assert true;
        }
    }

}