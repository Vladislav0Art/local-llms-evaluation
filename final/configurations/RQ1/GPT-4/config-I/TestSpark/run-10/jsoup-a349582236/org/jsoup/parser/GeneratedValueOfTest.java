package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() throws Exception {
        Tag tag = Tag.valueOf("SomeTagWithoutSettings");
        Assert.assertEquals("sometagwithoutsettings", tag.normalName());
    }

}