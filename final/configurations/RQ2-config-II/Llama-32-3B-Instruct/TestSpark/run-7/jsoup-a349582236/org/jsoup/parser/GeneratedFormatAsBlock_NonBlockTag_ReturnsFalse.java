package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_NonBlockTag_ReturnsFalse {

    @Test
    public void formatAsBlock_NonBlockTag_ReturnsFalse() {
        Tag tag = new Tag();
        Validate.assertFalse(tag.formatAsBlock());
    }

}