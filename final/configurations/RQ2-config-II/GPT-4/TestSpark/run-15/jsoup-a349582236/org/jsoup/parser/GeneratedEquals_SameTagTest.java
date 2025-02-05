package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedEquals_SameTagTest {

    @Test
    public void equals_SameTagTest() {
        Tag tag1 = Tag.valueOf("input");
        Tag tag2 = Tag.valueOf("input");
        assertTrue(tag1.equals(tag2));
    }

}