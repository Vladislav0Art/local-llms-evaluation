package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SelfClosingTag_SetsTrue {

    @Test
    public void setSelfClosing_SelfClosingTag_SetsTrue() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.setSelfClosing());
    }

}