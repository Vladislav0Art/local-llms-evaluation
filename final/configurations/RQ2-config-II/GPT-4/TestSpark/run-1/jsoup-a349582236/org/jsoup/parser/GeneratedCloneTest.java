package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag1 = Tag.valueOf("tagName");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

}