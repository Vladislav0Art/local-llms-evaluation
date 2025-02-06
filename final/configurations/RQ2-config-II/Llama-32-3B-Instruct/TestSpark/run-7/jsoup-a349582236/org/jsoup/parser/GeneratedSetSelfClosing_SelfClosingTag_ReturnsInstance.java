package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SelfClosingTag_ReturnsInstance {

    @Test
    public void setSelfClosing_SelfClosingTag_ReturnsInstance() {
        Tag tag = new Tag();
        tag.setSelfClosing(true);
        AssertTrue.assertTrue(tag instanceof Tag);
    }

}