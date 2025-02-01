package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertTrue(tag1.equals(tag2));

        Tag tag3 = Tag.valueOf("div");
        assertFalse(tag1.equals(tag3));
    }

}