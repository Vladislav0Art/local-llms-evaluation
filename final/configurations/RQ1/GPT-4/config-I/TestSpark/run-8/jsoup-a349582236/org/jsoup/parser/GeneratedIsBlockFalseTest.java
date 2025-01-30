package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockFalseTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isBlockFalseTest() {
        Tag tag = Tag.valueOf("a");
        assertFalse(tag.isBlock());
    }

}