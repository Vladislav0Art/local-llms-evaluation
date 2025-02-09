package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsEmpty_notEmptyTagName tagWithoutEmptyTagName tagWithNoSelfClosingAttribute returnsFalse {

    @Test
    public void testIsEmpty_notEmptyTagName
    tagWithoutEmptyTagName tagWithNoSelfClosingAttribute

    returnsFalse() {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag actualTag = Tag.valueOf(tagName, settings);
        assertFalse(actualTag.isEmpty());
    }

}