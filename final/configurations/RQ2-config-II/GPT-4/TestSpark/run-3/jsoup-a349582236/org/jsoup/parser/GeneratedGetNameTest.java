package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("test");
        assertEquals("test", tag.getName());
    }

}