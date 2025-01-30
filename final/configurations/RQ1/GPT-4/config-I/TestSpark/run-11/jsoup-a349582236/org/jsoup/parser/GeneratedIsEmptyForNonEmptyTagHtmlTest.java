package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsEmptyForNonEmptyTagHtmlTest {

    @Test
    public void isEmptyForNonEmptyTagHtmlTest() {
        Assert.assertFalse(Tag.valueOf("html").isEmpty());
    }

}