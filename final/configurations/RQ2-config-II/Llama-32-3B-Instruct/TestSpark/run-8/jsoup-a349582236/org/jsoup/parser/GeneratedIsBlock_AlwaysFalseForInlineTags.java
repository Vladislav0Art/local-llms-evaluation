package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.Tag;

public class GeneratedIsBlock_AlwaysFalseForInlineTags {

    @Test
    public void isBlock_AlwaysFalseForInlineTags() {
        assertTrue(Tag.valueOf("").isInline());
        assertFalse(Tag.valueOf("<br>").isBlock());
    }

}