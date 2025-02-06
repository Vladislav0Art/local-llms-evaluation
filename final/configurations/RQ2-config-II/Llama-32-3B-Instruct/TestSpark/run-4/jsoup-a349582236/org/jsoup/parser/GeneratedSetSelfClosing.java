package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedSetSelfClosing {

    @Test
    public void setSelfClosing() {
        Tag tag = org.jsoup.parser.Tag.valueOf("");
        tag.setSelfClosing();
        assertEquals(Tag.selfClosing, tag.isSelfClosing());
    }

}