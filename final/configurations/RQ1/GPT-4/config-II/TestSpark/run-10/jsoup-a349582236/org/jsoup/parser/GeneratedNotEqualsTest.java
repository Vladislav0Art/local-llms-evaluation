package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedNotEqualsTest {

    @Test
    public void notEqualsTest() {
        Tag tag1 = new Tag("p");
        Tag tag2 = new Tag("a");

        Assert.assertNotEquals(tag1, tag2);
    }

}