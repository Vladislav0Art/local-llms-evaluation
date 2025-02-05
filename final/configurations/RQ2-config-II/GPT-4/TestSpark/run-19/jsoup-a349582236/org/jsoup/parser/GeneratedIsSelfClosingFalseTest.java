package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsSelfClosingFalseTest {

    @Test
    public void isSelfClosingFalseTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertFalse(tag.isSelfClosing());
    }

}