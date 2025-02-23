package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedIsBlock {

    Tag tag;

    @Before
    public void setUp() {
        tag = new Tag("tagName");
    }

    @Test
    public void isBlock() {
        assertTrue(tag.isBlock());
    }

}