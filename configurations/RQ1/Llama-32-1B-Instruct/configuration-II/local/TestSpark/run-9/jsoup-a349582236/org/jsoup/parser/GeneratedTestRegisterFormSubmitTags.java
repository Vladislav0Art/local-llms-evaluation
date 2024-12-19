package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormSubmitTags {

    @Test
    public void testRegisterFormSubmitTags() {
        Tag tag1 = new Tag("button");
        tag1.formSubmit = true;
        Main.register(tag1);
        assert Main.tags.containsKey(tag1.tagName).formSubmit;

        assert !Main.tags.containsKey(tag1.tagName).preserveWhitespace;
    }

}