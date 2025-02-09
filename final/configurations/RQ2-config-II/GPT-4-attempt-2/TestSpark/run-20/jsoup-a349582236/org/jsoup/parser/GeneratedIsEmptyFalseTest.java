package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsEmptyFalseTest {

    @Test
    public void isEmptyFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isEmpty());
    }

}