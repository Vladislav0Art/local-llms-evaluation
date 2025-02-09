package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestFormatAsBlock_tagWithNoBlockAttribute_tagWithoutEmptyTagName tagWithSelfClosingAttribute_returnsTrue {

    @Test
    public void testFormatAsBlock_tagWithNoBlockAttribute_tagWithoutEmptyTagName

    tagWithSelfClosingAttribute_returnsTrue() {
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        Tag actualTag = Tag.valueOf(tagName, settings);
        assertTrue(actualTag.formatAsBlock());
    }

}