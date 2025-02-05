package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Tag tagOne = Tag.valueOf("input");
        Tag tagTwo = Tag.valueOf("input");
        assertTrue(tagOne.equals(tagTwo));
    }

}