package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_BlockTag_ReturnsTrue {

    @Test
    public void isBlock_BlockTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("img");
        tag.setBlock(true);
        Validate.isTrue(tag.isBlock());
    }

}