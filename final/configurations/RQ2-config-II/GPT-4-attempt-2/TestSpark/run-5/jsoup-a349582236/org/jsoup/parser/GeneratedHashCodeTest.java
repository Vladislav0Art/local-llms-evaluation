package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals(tag.hashCode(), Tag.valueOf("div").hashCode());
    }

}