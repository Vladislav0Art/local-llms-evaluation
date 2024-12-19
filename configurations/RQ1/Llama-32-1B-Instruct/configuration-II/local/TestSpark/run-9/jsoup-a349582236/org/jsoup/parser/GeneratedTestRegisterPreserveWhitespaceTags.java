package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterPreserveWhitespaceTags {

    @Test
    public void testRegisterPreserveWhitespaceTags() {
        Tag tag = new Tag("pre");
        tag.preserveWhitespace = true;
        Main.register(tag);
        assert Main.tags.containsKey(tag.tagName).preserveWhitespace;

        assert !Main.tags.containsKey(tag.tagName).isBlock;
        assert !Main.tags.get(tag.tagName).formatAsBlock;
    }

}