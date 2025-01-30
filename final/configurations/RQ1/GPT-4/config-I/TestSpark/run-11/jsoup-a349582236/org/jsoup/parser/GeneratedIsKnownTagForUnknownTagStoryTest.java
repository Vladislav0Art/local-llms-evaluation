package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsKnownTagForUnknownTagStoryTest {

    @Test
    public void isKnownTagForUnknownTagStoryTest() {
        Assert.assertFalse(Tag.isKnownTag("story"));
    }

}