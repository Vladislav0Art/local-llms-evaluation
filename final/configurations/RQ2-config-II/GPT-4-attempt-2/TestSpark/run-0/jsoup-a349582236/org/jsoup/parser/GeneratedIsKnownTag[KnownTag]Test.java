package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsKnownTag[KnownTag]

Test {

    @Test
    public void isKnownTag[ KnownTag]Test() {
        Tag tag = Tag.valueOf("div");
        Assert.assertTrue(tag.isKnownTag());
    }

}