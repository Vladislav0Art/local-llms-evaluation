package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
        assertTrue(tag.isKnownTag());

        Tag tag1 = Tag.valueOf("unknownTag");
        assertEquals("unknowntag", tag1.getName());
        assertFalse(tag1.isKnownTag());
    }

}