package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.ParseException;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class GeneratedValueOfSensitiveCaseTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void valueOfSensitiveCaseTest() {
        Tag pTag = Tag.valueOf("P", ParseSettings.caseSensitive);
        assertEquals("P", pTag.getName());
    }

}