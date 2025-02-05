package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedClone_SameTagTest {

    @Test
    public void clone_SameTagTest() {
        Tag tag1 = Tag.valueOf("input");
        Tag tag2 = tag1.clone();
        assertTrue(tag1.equals(tag2));
    }

}