package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveWhitespaceTest {

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre");
        Assert.assertTrue(tag.preserveWhitespace());
    }

}