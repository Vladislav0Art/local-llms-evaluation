package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsKnownTagForKnownTagHeadTest {

    @Test
    public void isKnownTagForKnownTagHeadTest() {
        Assert.assertTrue(Tag.valueOf("head").isKnownTag());
    }

}