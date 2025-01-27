package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestUnknownTagNamePreserveWhitespaceReturnsFalseTest {

    @Test
    public void testUnknownTagNamePreserveWhitespaceReturnsFalseTest() {
        Tag tag = Tag.valueOf("abc");
        assertFalse(tag.preserveWhitespace());
    }

}