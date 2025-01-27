package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_BlockTagsAreTrueByDefault {

    @Test
    public void formatAsBlock_BlockTagsAreTrueByDefault() {
        String tagName = "p";
        assertTrue(Tag.valueOf(tagName).formatAsBlock());
    }

}