package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.Tag;

public class GeneratedIsInline_AlwaysFalseForBlocks {

    @Test
    public void isInline_AlwaysFalseForBlocks() {
        assertFalse(Tag.valueOf("<div>").isInline());
    }

}