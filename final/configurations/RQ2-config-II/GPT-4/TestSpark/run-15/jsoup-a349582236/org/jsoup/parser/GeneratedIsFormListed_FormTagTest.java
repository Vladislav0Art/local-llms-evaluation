package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsFormListed_FormTagTest {

    @Test
    public void isFormListed_FormTagTest() {
        Tag tag = Tag.valueOf("option");
        assertTrue(tag.isFormListed());
    }

}