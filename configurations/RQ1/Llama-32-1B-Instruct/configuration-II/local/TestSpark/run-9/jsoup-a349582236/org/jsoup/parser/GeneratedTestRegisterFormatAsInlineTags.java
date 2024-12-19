package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormatAsInlineTags {

    @Test
    public void testRegisterFormatAsInlineTags() {
        Tag tag = new Tag("a");
        tag.formatAsBlock = false;
        tag.isBlock = true;
        tag.formatAsBlock = false;
        Main.register(tag);
        assert !Main.tags.containsKey(tag.tagName).isBlock;
        assert !Main.tags.get(tag.tagName).formatAsBlock;
    }

}