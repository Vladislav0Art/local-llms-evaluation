package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertEquals("div", tag.getName());
    }

}