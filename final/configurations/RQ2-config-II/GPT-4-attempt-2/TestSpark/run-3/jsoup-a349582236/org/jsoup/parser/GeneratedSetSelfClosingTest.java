package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetSelfClosingTest {

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("span");
        Tag selfClosingTag = tag.setSelfClosing();
        Assert.assertTrue(selfClosingTag.isSelfClosing());
    }

}