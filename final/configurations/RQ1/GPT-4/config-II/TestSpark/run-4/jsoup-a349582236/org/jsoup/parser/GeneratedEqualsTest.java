package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag1 = new Tag("p");
        Tag tag2 = new Tag("p");
        assertTrue(tag1.equals(tag2));

        Tag tag3 = Tag.valueOf("div");
        assertFalse(tag1.equals(tag3));
    }

}