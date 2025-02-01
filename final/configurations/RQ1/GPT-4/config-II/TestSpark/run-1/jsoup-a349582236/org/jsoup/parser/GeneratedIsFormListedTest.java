package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag t = new Tag("input");
        assertTrue(t.isFormListed());
    }

}