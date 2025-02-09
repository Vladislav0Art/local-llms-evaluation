package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsInline_tagWithoutEmptyTagName tagWithNoSelfClosingAttribute_returnsFalse {

    @Test
    public void testIsInline_tagWithoutEmptyTagName

    tagWithNoSelfClosingAttribute_returnsFalse() {
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        Tag actualTag = Tag.valueOf(tagName, settings);
        assertFalse(actualTag.isInline());
    }

}