package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("span");
        assertEquals(false, tag.isBlock());
    }

}