package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("p");
        Tag clonedTag = tag.clone();
        assertNotSame(tag, clonedTag);
        assertEquals(tag, clonedTag);
    }

}