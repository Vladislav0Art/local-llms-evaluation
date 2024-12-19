package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedValueOf_ValidTagName_ReturnsPredefinedTag {

    @Test
    public void valueOf_ValidTagName_ReturnsPredefinedTag() {
        Tag actual = Tag.valueOf("div", null);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals("div", actual.getName());
    }

}