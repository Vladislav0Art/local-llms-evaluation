package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFormatAsBlockTest_False {

    private String tagName = "div";
    private String normalName = Normalizer.lowerCase(tagName);
    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag(tagName);
        tag.tagName = tagName;
        tag.normalName = normalName;
    }

    @Test
    public void formatAsBlockTest_False() {
        tag.formatAsBlock = false;
        Assert.assertFalse(tag.formatAsBlock());
    }

}