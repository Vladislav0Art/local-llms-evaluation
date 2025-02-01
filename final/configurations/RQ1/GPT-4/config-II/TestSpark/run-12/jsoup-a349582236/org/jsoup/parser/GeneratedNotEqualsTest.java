package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNotEqualsTest {

    @Test
    public void notEqualsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("div");
        assertNotEquals(tag1, tag2);
    }

}