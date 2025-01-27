package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_AllowedTags_ReturnsTrue {

    @Test
    public void formatAsBlock_AllowedTags_ReturnsTrue() {
        String tagName = "p";
        assertTrue(Tag.formatAsBlock(tagName));
    }

}