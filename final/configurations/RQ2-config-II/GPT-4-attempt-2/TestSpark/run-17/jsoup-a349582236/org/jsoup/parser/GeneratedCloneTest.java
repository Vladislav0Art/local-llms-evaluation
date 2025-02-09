package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag1 = Tag.valueOf("a");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

}