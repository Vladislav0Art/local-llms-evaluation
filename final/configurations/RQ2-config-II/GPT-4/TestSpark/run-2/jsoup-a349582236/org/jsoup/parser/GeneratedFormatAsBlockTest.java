package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedFormatAsBlockTest {

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("span");
        Assert.assertFalse(tag.formatAsBlock());
    }

}