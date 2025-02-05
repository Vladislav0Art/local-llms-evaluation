package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = tag1.clone();
        assertTrue(tag1.equals(tag2));
    }

}