package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterFormListedTags {

    private static final String[] EMPTY_TAG_LIST = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };

    @Test
    public void testRegisterFormListedTags() {
        Tag tag = new Tag("button");
        System.out.println(tag);
        for (String tagName : formListedTags) {
            Validate.notNull(tags.get(tagName));
        }
    }

}