package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedValueOf_TagsWithSettings TestValueOfTagsWithSettings {

    @Test
    public void valueOf_TagsWithSettings

    TestValueOfTagsWithSettings() {
        ParseSettings settings = ParseSettings.values()[0];
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

}