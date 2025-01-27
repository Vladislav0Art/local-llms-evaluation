package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_NormalBlockTag_ReturnsTrue {

    @Test
    public void isBlock_NormalBlockTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}