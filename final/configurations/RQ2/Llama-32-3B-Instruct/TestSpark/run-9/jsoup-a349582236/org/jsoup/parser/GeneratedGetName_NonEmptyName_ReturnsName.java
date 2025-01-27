package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_NonEmptyName_ReturnsName {

    @Test
    public void getName_NonEmptyName_ReturnsName() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("div", tag.getName());
    }

}