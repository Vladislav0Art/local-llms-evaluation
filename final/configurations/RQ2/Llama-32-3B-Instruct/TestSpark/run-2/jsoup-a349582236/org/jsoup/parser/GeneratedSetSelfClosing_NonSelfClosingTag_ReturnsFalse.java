package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_NonSelfClosingTag_ReturnsFalse {

    @Test
    public void setSelfClosing_NonSelfClosingTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.setSelfClosing());
    }

}