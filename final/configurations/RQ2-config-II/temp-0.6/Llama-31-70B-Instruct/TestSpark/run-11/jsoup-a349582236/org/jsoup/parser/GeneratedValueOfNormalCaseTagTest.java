package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedValueOfNormalCaseTagTest {

    @Test
    public void valueOfNormalCaseTagTest() {
        String tagName = "p";
        ParseSettings parseSettings = ParseSettings.normalizeCase;
        Tag tag = Tag.valueOf(tagName, parseSettings);
        assertEquals(tagName, tag.tagName);
    }

}