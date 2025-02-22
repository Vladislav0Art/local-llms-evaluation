package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Tag tag = new Tag("testTagName");
        tag.empty = true;
        Assert.assertTrue(tag.isEmpty());
    }

}