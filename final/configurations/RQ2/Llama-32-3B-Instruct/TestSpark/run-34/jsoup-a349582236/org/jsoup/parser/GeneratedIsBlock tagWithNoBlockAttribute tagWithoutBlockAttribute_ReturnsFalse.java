package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock tagWithNoBlockAttribute tagWithoutBlockAttribute_ReturnsFalse {

    @Test
    public void isBlock

    tagWithNoBlockAttribute tagWithoutBlockAttribute_ReturnsFalse() {
        String tagName = "div";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isBlock());
    }

}