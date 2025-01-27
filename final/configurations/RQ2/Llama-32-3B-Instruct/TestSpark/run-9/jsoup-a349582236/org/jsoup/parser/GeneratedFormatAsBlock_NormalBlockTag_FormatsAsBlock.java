package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_NormalBlockTag_FormatsAsBlock {

    @Test
    public void formatAsBlock_NormalBlockTag_FormatsAsBlock() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.formatAsBlock());
    }

}