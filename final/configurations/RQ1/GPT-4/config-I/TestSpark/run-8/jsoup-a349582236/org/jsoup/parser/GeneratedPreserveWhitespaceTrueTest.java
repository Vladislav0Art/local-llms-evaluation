package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespaceTrueTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void preserveWhitespaceTrueTest() {
        Tag tag = Tag.valueOf("textarea");
        assertTrue(tag.preserveWhitespace());
    }

}