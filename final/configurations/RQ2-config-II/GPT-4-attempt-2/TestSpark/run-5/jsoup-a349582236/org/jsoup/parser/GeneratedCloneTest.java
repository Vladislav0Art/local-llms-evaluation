package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = (Tag) tag1.clone();
        assertEquals(tag1, tag2);
    }

}