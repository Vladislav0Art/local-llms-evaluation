package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedForFormTagTest {

    @Test
    public void isFormListedForFormTagTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());
    }

}