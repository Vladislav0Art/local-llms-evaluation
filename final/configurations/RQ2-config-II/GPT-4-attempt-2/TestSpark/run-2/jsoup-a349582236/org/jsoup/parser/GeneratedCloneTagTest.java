package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTagTest {

    @Test
    public void cloneTagTest() {
        Tag divTag = Tag.valueOf("div");
        Tag clonedTag = divTag.clone();
        assertEquals(divTag, clonedTag);
    }

}