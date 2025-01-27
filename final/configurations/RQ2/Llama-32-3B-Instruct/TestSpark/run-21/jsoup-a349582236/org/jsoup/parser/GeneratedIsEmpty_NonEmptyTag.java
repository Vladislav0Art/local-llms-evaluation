package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_NonEmptyTag {

    @Test
    public void isEmpty_NonEmptyTag() {
        Tag tag = new Tag("tag");
        Assert.assertFalse(tag.isEmpty());
    }

}