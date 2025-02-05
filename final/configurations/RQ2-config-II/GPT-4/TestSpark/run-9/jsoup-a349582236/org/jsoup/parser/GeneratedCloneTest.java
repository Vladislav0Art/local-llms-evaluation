package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals(tag.hashCode(), tag.clone().hashCode());
        assertFalse(tag == tag.clone());
    }

}