package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tag = Tag.valueOf("a");
        Tag anotherTag = Tag.valueOf("a");
        assertTrue(tag.equals(anotherTag));
    }

}