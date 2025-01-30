package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsAndHashCodeTest {

    @Test
    public void equalsAndHashCodeTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertTrue(tag1.equals(tag2));
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}