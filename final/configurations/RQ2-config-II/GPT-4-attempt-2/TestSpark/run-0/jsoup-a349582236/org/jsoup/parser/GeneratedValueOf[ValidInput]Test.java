package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedValueOf[ValidInput]

Test {

    @Test
    public void valueOf[ ValidInput]Test() {
        Tag tag = Tag.valueOf("p", ParseSettings.htmlDefault());
        Assert.assertEquals("p", tag.getName());
    }

}