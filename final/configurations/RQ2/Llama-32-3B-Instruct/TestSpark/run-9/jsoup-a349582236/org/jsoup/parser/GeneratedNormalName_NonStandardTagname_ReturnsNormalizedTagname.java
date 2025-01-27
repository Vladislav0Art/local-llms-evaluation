package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_NonStandardTagname_ReturnsNormalizedTagname {

    @Test
    public void normalName_NonStandardTagname_ReturnsNormalizedTagname() {
        String tagName = "<foo>";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag.normalName());
    }

}