package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

}