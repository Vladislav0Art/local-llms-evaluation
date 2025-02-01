package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedForNonFormTagTest {

    @Test
    public void isFormListedForNonFormTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isFormListed());
    }

}