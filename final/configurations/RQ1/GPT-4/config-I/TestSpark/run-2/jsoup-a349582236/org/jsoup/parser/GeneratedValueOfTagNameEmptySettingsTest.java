package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfTagNameEmptySettingsTest {

    @Test
    public void valueOfTagNameEmptySettingsTest() {
        Tag.valueOf("", ParseSettings.htmlDefault);
    }

}