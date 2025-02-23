package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedTagTest {

    @Test
    public void isFormListedTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isFormListed());
    }

}