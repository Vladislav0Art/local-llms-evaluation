package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsInlineTest {

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("span");
        Assert.assertTrue(tag.isInline());
    }

}