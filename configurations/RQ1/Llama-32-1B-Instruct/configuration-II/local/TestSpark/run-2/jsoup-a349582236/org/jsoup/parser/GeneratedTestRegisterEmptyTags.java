package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterEmptyTags {

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

}