package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSelfClosingTest {

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("br");
        Assert.assertTrue(tag.isSelfClosing());
    }

}