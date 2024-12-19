package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterEmptyTag {

    @Test
    public void testRegisterEmptyTag() {
        Tag tag = new Tag("meta");
        Main.register(tag);
        assert Main.tags.containsKey(tag.tagName);
        assert tag.empty;
    }

}