package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetKnownTag {

    @Test
    public void testGetKnownTag() {
        // Test case for getKnownTag method
        String tag = "form";
        TagParser tagParser = new TagParser();
        String knownTag = tagParser.getKnownTag(tag);
        assertEquals("form", knownTag);
    }

}