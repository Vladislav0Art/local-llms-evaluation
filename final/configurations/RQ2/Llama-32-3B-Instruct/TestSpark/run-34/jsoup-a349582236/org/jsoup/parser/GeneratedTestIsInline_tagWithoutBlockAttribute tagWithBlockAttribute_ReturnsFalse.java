package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsInline_tagWithoutBlockAttribute tagWithBlockAttribute_ReturnsFalse {

    @Test
    public void testIsInline_tagWithoutBlockAttribute

    tagWithBlockAttribute_ReturnsFalse() {
        String tagName = "pre";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isInline());
    }

}