package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsEmpty_emptyTagName tagWithoutEmptyTagName tagWithNoSelfClosingAttribute returnsTrue {

    @Test
    public void testIsEmpty_emptyTagName
    tagWithoutEmptyTagName tagWithNoSelfClosingAttribute

    returnsTrue() {
        String tagName = "";
        ParseSettings settings = new ParseSettings();
        Tag actualTag = Tag.valueOf(tagName, settings);
        assertTrue(actualTag.isEmpty());
    }

}