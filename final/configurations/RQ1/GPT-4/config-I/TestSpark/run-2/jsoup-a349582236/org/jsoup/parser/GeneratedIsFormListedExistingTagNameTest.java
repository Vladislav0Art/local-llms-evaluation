package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsFormListedExistingTagNameTest {

    @Test
    public void isFormListedExistingTagNameTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

}