package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestFormatAsBlock_tagWithNoBlockAttribute tagWithEmptyTagName_ReturnsTrue {

    @Test
    public void testFormatAsBlock_tagWithNoBlockAttribute

    tagWithEmptyTagName_ReturnsTrue() {
        String tagName = "";
        Tag actualTag = Tag.valueOf(tagName);
        assertTrue(actualTag.formatAsBlock());
    }

}