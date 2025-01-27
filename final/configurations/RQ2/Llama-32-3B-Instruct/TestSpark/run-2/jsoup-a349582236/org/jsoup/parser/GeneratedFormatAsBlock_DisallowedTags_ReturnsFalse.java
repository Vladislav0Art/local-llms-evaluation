package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_DisallowedTags_ReturnsFalse {

    @Test
    public void formatAsBlock_DisallowedTags_ReturnsFalse() {
        String tagName = "span";
        assertFalse(Tag.formatAsBlock(tagName));
    }

}