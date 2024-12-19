package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterFormatAsInlineTags {

    private static final String[] EMPTY_TAG_LIST = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };

    @Test
    public void testRegisterFormatAsInlineTags() {
        Tag tag = new Tag("title");
        System.out.println(tag);
        for (String tagName : formatAsInlineTags) {
            Validate.notNull(tags.get(tagName));
        }
    }

}