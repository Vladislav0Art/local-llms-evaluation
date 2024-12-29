package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("br");
        Assert.assertTrue(tag.isEmpty());
    }

}