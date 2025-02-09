package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("P");
        Assert.assertEquals("p", tag.normalName());
    }

}