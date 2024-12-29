package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("p");
        int expectedHashCode = tag.getName().hashCode();
        assertEquals(expectedHashCode, tag.hashCode());
    }

}