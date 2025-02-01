package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("DIV");
        String expectedNormalName = "div";
        String actualNormalName = tag.normalName();
        Assert.assertEquals(expectedNormalName, actualNormalName);
    }

}