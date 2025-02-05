package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSetSelfClosingTest {

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("img");
        tag.setSelfClosing();
        Assert.assertTrue(tag.isSelfClosing());
    }

}