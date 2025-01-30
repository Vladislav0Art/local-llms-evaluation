package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedFormatAsBlockForRegularTagHtmlTest {

    @Test
    public void formatAsBlockForRegularTagHtmlTest() {
        Assert.assertTrue(Tag.valueOf("html").formatAsBlock());
    }

}