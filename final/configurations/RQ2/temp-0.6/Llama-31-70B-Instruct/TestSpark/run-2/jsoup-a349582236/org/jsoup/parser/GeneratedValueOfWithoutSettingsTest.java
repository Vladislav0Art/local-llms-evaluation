package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithoutSettingsTest {

    @Test
    public void valueOfWithoutSettingsTest() {
        String tagName = "div";
        Tag actual = Tag.valueOf(tagName);
        assertNotNull(actual);
    }

}