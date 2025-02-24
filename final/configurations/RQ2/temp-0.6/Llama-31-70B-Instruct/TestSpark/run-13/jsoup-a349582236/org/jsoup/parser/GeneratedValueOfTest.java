package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfTest {

    private static final String TAG_NAME = "div";
    private static final ParseSettings PARSE_SETTINGS = new ParseSettings(false, false);
    private static final Tag TAG_VALUE = new Tag(TAG_NAME);
    private static final Tag TAG_VALUE_WITH_SETTINGS = new Tag(TAG_NAME, PARSE_SETTINGS);

    @Test
    public void valueOfTest() {
        Assert.assertEquals(TAG_VALUE, Tag.valueOf(TAG_NAME));
        Assert.assertEquals(TAG_VALUE_WITH_SETTINGS, Tag.valueOf(TAG_NAME, PARSE_SETTINGS));
    }

}