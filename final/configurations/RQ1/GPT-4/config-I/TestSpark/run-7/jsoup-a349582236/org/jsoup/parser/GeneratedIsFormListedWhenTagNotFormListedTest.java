package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedWhenTagNotFormListedTest {

    @Test
    public void isFormListedWhenTagNotFormListedTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormListed());
    }

}