package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedIsSelfClosing[NormalTag]

Test {

    @Test
    public void isSelfClosing[ NormalTag]Test() {
        Tag tag = Tag.valueOf("div");
        Assert.assertFalse(tag.isSelfClosing());
    }

}