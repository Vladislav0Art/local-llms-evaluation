package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        String tagName = "testTagName";
        Tag actualTag = new Tag(tagName);
        Assert.assertEquals(tagName, actualTag.tagName);
        Assert.assertEquals(Normalizer.lowerCase(tagName), actualTag.normalName);
    }

}