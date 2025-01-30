package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsInlineFalseTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void isInlineFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());
    }

}