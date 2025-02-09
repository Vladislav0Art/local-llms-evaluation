package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void testIsBlock_tagWithoutBlockAttribute_ReturnsFalse() {
        String tagName = "img";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isBlock());
    }

    @Test
    public void testIsInline_tagWithBlockAttribute_tagWithoutBlockAttribute_ReturnsFalse() {
        String tagName = "pre";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isInline());
    }

    @Test
    public void testIsSelfClosing_noSelfClosingAttribute_returnsFalse() {
        String tagName = "img";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isSelfClosing());
    }

}