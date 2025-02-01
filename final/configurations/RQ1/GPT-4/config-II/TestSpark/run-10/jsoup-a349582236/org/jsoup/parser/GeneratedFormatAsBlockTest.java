package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("p");
        Assert.assertTrue(tag.formatAsBlock());
    }

}