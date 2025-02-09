package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("div");
        assertFalse(tag1.equals(tag2));
    }

}