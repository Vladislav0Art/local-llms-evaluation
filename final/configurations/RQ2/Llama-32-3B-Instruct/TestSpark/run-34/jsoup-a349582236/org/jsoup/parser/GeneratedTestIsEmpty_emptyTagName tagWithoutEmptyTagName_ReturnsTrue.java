package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsEmpty_emptyTagName tagWithoutEmptyTagName_ReturnsTrue {

    @Test
    public void testIsEmpty_emptyTagName

    tagWithoutEmptyTagName_ReturnsTrue() {
        String tagName = "";
        Tag actualTag = Tag.valueOf(tagName);
        assertTrue(actualTag.isEmpty());
    }

}