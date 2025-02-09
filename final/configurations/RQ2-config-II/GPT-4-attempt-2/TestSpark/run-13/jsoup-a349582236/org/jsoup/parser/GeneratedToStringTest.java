package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("p");
        Assert.assertEquals("<p>", tag.toString());
    }

}