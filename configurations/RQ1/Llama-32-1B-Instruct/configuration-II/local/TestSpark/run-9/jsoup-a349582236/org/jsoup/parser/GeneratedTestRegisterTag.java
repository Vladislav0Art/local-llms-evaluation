package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTag {

    @Test
    public void testRegisterTag() {
        Tag tag = new Tag("a");
        Main.register(tag);
        assert Main.tags.containsKey(tag.tagName);
        assert !Main.tags.get(tag.tagName).isBlock;
        assert !Main.tags.get(tag.tagName).formatAsBlock;
        assert !Main.tags.get(tag.tagName).preserveWhitespace;
    }

}