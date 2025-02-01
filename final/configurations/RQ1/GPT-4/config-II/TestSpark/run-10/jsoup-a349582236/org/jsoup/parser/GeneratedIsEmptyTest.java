package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("img");
        Assert.assertTrue(tag.isEmpty());
    }

}