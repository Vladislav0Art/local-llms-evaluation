package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSelfClosingTest {

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("img");
        Assert.assertTrue(tag.isSelfClosing());
    }

}