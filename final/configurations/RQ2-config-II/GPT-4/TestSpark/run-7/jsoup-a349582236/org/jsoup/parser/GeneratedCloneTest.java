package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tagOne = Tag.valueOf("input");
        Tag cloneTag = tagOne.clone();
        assertTrue(tagOne.equals(cloneTag));
        assertEquals(tagOne.hashCode(), cloneTag.hashCode());
    }

}