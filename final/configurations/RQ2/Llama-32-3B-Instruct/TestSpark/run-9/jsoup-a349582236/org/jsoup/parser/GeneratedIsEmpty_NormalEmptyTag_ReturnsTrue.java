package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_NormalEmptyTag_ReturnsTrue {

    @Test
    public void isEmpty_NormalEmptyTag_ReturnsTrue() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isEmpty());
    }

}