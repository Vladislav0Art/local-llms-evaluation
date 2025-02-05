package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tagOne = Tag.valueOf("input");
        Tag tagTwo = Tag.valueOf("input");
        assertEquals(tagOne.hashCode(), tagTwo.hashCode());
    }

}