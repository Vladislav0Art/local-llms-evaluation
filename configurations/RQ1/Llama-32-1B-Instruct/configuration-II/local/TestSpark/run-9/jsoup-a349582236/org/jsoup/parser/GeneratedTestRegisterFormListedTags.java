package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormListedTags {

    @Test
    public void testRegisterFormListedTags() {
        Tag tag1 = new Tag("button");
        tag1.formList = true;
        Main.register(tag1);
        assert Main.tags.containsKey(tag1.tagName).formList;

        assert !Main.tags.containsKey(tag1.tagName).preserveWhitespace;
    }

}