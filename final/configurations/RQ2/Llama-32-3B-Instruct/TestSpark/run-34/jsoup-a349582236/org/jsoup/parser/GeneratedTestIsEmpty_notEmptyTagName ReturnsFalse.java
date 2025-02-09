package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsEmpty_notEmptyTagName ReturnsFalse {

    @Test
    public void testIsEmpty_notEmptyTagName

    ReturnsFalse() {
        String tagName = "div";
        Tag actualTag = Tag.valueOf(tagName);
        assertFalse(actualTag.isEmpty());
    }

}