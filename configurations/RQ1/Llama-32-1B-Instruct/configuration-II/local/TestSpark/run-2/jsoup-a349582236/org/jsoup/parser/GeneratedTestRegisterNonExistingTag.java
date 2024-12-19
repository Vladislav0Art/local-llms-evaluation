package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterNonExistingTag {

    private static final String[] EMPTY_TAG_LIST = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };

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