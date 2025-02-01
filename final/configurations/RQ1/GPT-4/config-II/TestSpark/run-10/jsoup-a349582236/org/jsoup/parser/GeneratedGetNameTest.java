package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("tag_name");
        Assert.assertEquals("tag_name", tag.getName());
    }

}