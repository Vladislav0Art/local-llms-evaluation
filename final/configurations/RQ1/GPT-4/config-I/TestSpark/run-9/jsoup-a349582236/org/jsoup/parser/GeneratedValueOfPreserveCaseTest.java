package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfPreserveCaseTest {

    @Test
    public void valueOfPreserveCaseTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.preserveCase);
        Assert.assertEquals("DIV", tag.getName());
    }

}