package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("div");
        Tag clonedTag = tag.clone();
        assertEquals(tag, clonedTag);
    }

}