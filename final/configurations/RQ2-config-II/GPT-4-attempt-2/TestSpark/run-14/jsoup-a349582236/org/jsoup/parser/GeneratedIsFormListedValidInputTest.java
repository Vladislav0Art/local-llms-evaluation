package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsFormListedValidInputTest {

    @Test
    public void isFormListedValidInputTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

}