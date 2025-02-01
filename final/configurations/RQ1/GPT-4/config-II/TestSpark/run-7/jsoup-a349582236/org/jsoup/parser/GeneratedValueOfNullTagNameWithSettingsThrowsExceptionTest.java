package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedValueOfNullTagNameWithSettingsThrowsExceptionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void valueOfNullTagNameWithSettingsThrowsExceptionTest() {
        exception.expect(IllegalArgumentException.class);
        Tag.valueOf(null, ParseSettings.htmlDefault);
    }

}