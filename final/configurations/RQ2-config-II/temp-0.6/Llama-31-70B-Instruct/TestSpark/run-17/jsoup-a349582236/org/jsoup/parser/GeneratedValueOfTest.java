package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOfTest {

    @Test
    public void valueOfTest() {
        ParseSettings settings = new ParseSettings();
        Tag tag = new Tag();
        Assert.assertEquals(tag.valueOf("TagName", settings), tag);
    }

}