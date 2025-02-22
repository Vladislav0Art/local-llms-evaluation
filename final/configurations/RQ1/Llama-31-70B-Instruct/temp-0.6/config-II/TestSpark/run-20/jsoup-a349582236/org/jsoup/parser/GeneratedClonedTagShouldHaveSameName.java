package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedClonedTagShouldHaveSameName {

    @Test
    public void clonedTagShouldHaveSameName() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        Tag clonedTag = tag.clone();
        assertEquals(tagName, clonedTag.tagName);
    }

}