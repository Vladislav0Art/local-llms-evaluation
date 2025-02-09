package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestFormatAsBlock_tagWithNoBlockAttribute_tagWithoutEmptyTagName tagWithEmptyTagName tagWithSelfClosingAttribute returnsTrue {

    @Test
    public void testFormatAsBlock_tagWithNoBlockAttribute_tagWithoutEmptyTagName
    tagWithEmptyTagName tagWithSelfClosingAttribute

    returnsTrue() {
        String tagName = "";
        ParseSettings settings = new ParseSettings();
        Tag actualTag = Tag.valueOf(tagName, settings);
        assertTrue(actualTag.formatAsBlock());
    }

}