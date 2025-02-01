package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSelfTest {

    @Test
    public void equalsSelfTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.equals(tag));
    }

}