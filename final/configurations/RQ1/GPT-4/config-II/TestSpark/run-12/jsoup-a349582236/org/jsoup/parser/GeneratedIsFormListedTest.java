package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());
    }

}