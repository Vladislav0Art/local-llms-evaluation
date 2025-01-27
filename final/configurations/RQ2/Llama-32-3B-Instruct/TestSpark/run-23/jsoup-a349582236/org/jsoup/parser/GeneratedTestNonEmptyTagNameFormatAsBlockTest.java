package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNonEmptyTagNameFormatAsBlockTest {

    @Test
    public void testNonEmptyTagNameFormatAsBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
        // This is not very accurate because we have to rely on
        // the browser's DOM implementation.
    }

}