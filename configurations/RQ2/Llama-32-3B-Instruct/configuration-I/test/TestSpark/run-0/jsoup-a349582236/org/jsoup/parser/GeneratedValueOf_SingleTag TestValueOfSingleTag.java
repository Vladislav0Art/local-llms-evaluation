package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedValueOf_SingleTag TestValueOfSingleTag {

    @Test
    public void valueOf_SingleTag

    TestValueOfSingleTag() {
        String tagName = "img";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

}