package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedTagNameTest {

    @Test
    public void isFormListedTagNameTest() {
        Tag tag = new Tag("tagName");
        assertFalse(tag.isFormListed());
    }

}