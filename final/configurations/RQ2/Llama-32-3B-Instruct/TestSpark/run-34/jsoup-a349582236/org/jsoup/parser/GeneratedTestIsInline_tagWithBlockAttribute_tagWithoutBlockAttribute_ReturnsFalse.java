package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsInline_tagWithBlockAttribute_tagWithoutBlockAttribute_ReturnsFalse {

    @Test
    public void testIsInline_tagWithBlockAttribute_tagWithoutBlockAttribute_ReturnsFalse() {
        String tagName = "pre";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isInline());
    }

}