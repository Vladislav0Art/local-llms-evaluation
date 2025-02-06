package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_tagNameDivOrLi {

    @Test
    public void isBlock_tagNameDivOrLi() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
        assertFalse(tag.isBlock());
    }

}