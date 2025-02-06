package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_selfClosingTag {

    @Test
    public void setSelfClosing_selfClosingTag() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}