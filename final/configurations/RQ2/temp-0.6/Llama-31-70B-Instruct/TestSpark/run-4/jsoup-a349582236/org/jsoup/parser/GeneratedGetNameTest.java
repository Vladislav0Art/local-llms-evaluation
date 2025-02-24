package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("test");
        String name = tag.getName();
        Assert.assertEquals("test", name);
    }

}