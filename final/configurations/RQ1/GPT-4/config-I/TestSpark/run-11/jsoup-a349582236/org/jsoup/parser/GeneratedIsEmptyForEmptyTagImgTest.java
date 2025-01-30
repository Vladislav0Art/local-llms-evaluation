package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsEmptyForEmptyTagImgTest {

    @Test
    public void isEmptyForEmptyTagImgTest() {
        Assert.assertTrue(Tag.valueOf("img").isEmpty());
    }

}