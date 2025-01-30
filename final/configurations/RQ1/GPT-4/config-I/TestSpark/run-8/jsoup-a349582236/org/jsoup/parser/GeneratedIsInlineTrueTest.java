package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineTrueTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isInlineTrueTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

}