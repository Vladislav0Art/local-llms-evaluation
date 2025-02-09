package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedIsFormListedFalseTest {

    @Test
    public void isFormListedFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormListed());
    }

}