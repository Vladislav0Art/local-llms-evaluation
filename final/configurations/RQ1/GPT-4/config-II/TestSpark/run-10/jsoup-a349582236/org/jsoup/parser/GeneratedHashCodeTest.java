package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Map;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = new Tag("html");
        int hashCode = tag.hashCode();
        Assert.assertEquals(hashCode, tag.hashCode());
    }

}