package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfPreserveCaseUnknownTagTest {

    @Test
    public void valueOfPreserveCaseUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown", ParseSettings.preserveCase);
        Assert.assertEquals("unknown", tag.getName());
    }

}