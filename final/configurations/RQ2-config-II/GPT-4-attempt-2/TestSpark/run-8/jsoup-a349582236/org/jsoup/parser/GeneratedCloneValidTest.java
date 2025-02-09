package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedCloneValidTest {

    @Test
    public void cloneValidTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

}