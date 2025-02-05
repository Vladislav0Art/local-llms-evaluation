package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsSelfClosingTrueTest {

    @Test
    public void isSelfClosingTrueTest() {
        Tag tag = Tag.valueOf("hr");
        Assert.assertTrue(tag.isSelfClosing());
    }

}