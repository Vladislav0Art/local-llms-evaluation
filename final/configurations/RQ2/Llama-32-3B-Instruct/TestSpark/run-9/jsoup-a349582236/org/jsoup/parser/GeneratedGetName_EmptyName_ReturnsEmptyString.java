package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_EmptyName_ReturnsEmptyString {

    @Test
    public void getName_EmptyName_ReturnsEmptyString() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("", tag.getName());
    }

}