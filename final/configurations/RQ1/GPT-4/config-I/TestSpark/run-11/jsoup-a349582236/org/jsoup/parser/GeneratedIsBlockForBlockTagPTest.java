package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlockForBlockTagPTest {

    @Test
    public void isBlockForBlockTagPTest() {
        Assert.assertTrue(Tag.valueOf("p").isBlock());
    }

}