package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfLowercaseTagsTest {

    @Test
    public void valueOfLowercaseTagsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        Assert.assertEquals("div", tag.getName());
    }

}