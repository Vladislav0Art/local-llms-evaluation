package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_NonBlockTag_ReturnsFalse {

    @Test
    public void isBlock_NonBlockTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("span");
        Validate.assertFalse(tag.isBlock());
    }

}