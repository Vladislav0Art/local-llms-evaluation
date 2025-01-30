package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfEmptyTagNameWithSettingsTest {

    @Test
    public void valueOfEmptyTagNameWithSettingsTest() {
        Tag.valueOf("", new ParseSettings(true, true));
    }

}