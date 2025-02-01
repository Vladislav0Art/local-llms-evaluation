package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfPreserveCaseKnownTagTest {

    @Test
    public void valueOfPreserveCaseKnownTagTest() {
        Tag tag = Tag.valueOf("HTML", ParseSettings.preserveCase);
        Assert.assertEquals("HTML", tag.getName());
    }

}