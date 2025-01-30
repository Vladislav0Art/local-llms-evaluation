package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTagNameTest {

    @Test
    public void isInlineTagNameTest() {
        Tag tag = new Tag("tagName");
        assertFalse(tag.isInline());
    }

}