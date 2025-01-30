package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class GeneratedGetNameAndNormalNameTest {

    @Test
    public void getNameAndNormalNameTest() throws Exception {
        Tag tag = Tag.valueOf("SomeTagWithSettings", ParseSettings.htmlDefault);
        Assert.assertEquals("sometagwithsettings", tag.normalName());
    }

}