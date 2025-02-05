package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedHashCode_SameTagTest {

    @Test
    public void hashCode_SameTagTest() {
        Tag tag1 = Tag.valueOf("input");
        Tag tag2 = Tag.valueOf("input");
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}