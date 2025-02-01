package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("meta");
        Assert.assertTrue(tag.isEmpty());
    }

}