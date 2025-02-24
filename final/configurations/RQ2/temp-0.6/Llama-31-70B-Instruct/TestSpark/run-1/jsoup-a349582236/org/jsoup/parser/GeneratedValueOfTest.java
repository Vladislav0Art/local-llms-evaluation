package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("div", settings);
        assertEquals("div", tag.getName());
    }

}