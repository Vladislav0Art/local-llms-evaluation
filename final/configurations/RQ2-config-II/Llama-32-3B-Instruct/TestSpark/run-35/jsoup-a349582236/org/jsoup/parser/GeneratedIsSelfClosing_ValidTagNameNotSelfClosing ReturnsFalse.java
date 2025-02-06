package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedIsSelfClosing_ValidTagNameNotSelfClosing ReturnsFalse {

    @Test
    public void isSelfClosing_ValidTagNameNotSelfClosing

    ReturnsFalse() {
        String tagName = "a";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isSelfClosing());
    }

}