package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedOptionTagTest {

    @Test
    public void isFormListedOptionTagTest() {
        Tag tag = Tag.valueOf("option");
        assertTrue(tag.isFormListed());
    }

}