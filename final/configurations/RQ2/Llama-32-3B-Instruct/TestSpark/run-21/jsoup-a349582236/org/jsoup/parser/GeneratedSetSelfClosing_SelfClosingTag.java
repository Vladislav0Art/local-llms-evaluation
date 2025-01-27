package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SelfClosingTag {

    @Test
    public void setSelfClosing_SelfClosingTag() {
        String tagName = "<img>";
        Tag tag = new Tag(tagName);
        Tag selfClosingTag = (Tag) tag.setSelfClosing();
        Assert.assertEquals(selfClosingTag, tag);
    }

}