package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag cloneTag = tag1.clone();
        assertEquals(tag1, cloneTag);
    }

}