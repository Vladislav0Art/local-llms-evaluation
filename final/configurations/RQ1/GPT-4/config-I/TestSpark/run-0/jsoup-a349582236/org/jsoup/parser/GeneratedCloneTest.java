package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("div");
        Tag tagClone = tag.clone();
        assertEquals(tag, tagClone);
        assertNotSame(tag, tagClone);
    }

}