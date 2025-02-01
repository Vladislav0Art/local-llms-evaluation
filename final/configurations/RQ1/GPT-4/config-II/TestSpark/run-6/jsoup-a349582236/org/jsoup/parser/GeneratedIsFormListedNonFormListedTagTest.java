package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedNonFormListedTagTest {

    @Test
    public void isFormListedNonFormListedTagTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isFormListed());
    }

}