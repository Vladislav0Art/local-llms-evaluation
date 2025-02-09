package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}