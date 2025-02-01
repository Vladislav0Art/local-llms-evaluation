package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("div");
        Tag clone = tag.clone();
        assertEquals(tag, clone);
    }

}