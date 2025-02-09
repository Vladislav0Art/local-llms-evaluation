package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("P");
        Assert.assertEquals("P", tag.getName());
    }

}