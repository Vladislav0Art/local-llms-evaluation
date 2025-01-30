package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockTrueTest {

    private ParseSettings defaultSettings = ParseSettings.preserveCase;

    @Test
    public void formatAsBlockTrueTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

}