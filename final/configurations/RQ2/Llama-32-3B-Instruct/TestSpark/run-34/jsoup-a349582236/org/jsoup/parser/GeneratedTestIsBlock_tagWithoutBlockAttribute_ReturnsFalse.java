package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsBlock_tagWithoutBlockAttribute_ReturnsFalse {

    @Test
    public void testIsBlock_tagWithoutBlockAttribute_ReturnsFalse() {
        String tagName = "img";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isBlock());
    }

}