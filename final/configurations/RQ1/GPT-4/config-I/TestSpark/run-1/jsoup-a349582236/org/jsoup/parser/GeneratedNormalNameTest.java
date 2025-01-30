package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        String name = "TestName";
        Tag tag = Tag.valueOf(name);
        Assert.assertEquals(name.toLowerCase(), tag.normalName());
    }

}