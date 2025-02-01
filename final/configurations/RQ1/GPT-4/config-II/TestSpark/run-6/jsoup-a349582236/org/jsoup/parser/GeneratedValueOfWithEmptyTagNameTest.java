package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOfWithEmptyTagNameTest {

    @Test
    public void valueOfWithEmptyTagNameTest() {
        Tag.valueOf("", ParseSettings.lowerCase);
    }

}