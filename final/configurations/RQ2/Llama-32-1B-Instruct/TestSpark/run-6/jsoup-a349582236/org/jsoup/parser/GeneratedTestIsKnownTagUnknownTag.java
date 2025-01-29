package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestIsKnownTagUnknownTag {

    @Test
    public void testIsKnownTagUnknownTag() {
        boolean result = Tag.isKnownTag("unknown-tag");
        assertFalse(result);
    }

}