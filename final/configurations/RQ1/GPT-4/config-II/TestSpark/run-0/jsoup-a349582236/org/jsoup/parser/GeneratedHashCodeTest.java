package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("p");
        int expectedHashCode = tag.hashCode();
        assertEquals(expectedHashCode, tag.hashCode());
    }

}