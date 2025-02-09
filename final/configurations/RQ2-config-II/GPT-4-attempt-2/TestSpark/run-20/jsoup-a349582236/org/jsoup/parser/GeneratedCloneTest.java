package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("p");
        Tag cloneTag = tag.clone();
        assertEquals(tag, cloneTag);
    }

}