package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterFormSubmitTags {

    private static final String[] EMPTY_TAG_LIST = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };

    @Test
    public void testRegisterFormSubmitTags() {
        Tag tag = new Tag("input");
        System.out.println(tag);
        for (String tagName : formSubmitTags) {
            Validate.notNull(tags.get(tagName));
        }
    }

}