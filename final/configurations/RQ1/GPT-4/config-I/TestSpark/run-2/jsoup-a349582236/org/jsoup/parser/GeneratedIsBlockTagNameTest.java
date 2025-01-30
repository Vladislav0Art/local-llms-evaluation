package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockTagNameTest {

    @Test
    public void isBlockTagNameTest() {
        Tag tag = new Tag("tagName");
        assertTrue(tag.isBlock());
    }

}