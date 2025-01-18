package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag1 = Tag.valueOf("a");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

}