package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagMultipleTimes {

    @Test
    public void testRegisterTagMultipleTimes() {
        Tag tag1 = new Tag("a");
        Main.register(tag1);
        Tag tag2 = new Tag("button");
        Main.register(tag2);
        assert Main.tags.containsKey(tag1.tagName);
        assert !Main.tags.get(tag1.tagName).isBlock;
        assert !Main.tags.get(tag1.tagName).formatAsBlock;
        assert !Main.tags.get(tag1.tagName).preserveWhitespace;

        assert Main.tags.containsKey(tag2.tagName);
        assert !Main.tags.get(tag2.tagName).isBlock;
        assert !Main.tags.get(tag2.tagName).formatAsBlock;
        assert !Main.tags.get(tag2.tagName).preserveWhitespace;
    }

}