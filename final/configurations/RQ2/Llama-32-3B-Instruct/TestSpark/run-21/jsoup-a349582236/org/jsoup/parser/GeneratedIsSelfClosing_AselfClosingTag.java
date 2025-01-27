package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_AselfClosingTag {

    @Test
    public void isSelfClosing_AselfClosingTag() {
        Tag tag = new Tag("<img>");
        Assert.assertTrue(tag.isSelfClosing());
    }

}