package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyTag {

    @Test
    public void isEmpty_EmptyTag() {
        Tag tag = new Tag("");
        Assert.assertTrue(tag.isEmpty());
    }

}