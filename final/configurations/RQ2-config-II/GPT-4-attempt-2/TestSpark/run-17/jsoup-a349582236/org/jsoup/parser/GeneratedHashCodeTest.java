package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag1 = Tag.valueOf("a");
        Tag tag2 = Tag.valueOf("a");
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}