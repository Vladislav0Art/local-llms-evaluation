package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class GeneratedIsKnownTagTest {

    @Test
    public void isKnownTagTest() throws NoSuchFieldException, IllegalAccessException {
        Tag tag = Tag.valueOf("br", ParseSettings.htmlDefault);
        Assert.assertTrue(tag.isKnownTag());
    }

}