package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTagTest {

    @Test
    public void isEmptyTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());
    }

}