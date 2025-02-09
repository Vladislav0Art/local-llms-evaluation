package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedSetSelfClosing[SelfClosingTag]

Test {

    @Test
    public void setSelfClosing[ SelfClosingTag]Test() {
        Tag tag = Tag.valueOf("img");
        Assert.assertTrue(tag.setSelfClosing().isSelfClosing());
    }

}