package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedIsFormListedTest {

    @Test
    public void isFormListedTest() {
        Tag tag = new Tag("button");
        assertTrue(tag.isFormListed());
    }

}