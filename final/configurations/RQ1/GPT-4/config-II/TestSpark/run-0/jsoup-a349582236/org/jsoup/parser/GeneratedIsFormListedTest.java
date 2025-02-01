package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());

        Tag tagNotListed = Tag.valueOf("div");
        assertFalse(tagNotListed.isFormListed());
    }

}