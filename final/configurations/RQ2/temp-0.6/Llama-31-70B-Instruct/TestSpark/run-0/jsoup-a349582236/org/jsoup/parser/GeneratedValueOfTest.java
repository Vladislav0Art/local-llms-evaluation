package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Tag;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        ParseSettings settings = new ParseSettings(false, false);
        Tag tag = Tag.valueOf("div", settings);
        assertNotNull(tag);
    }

}