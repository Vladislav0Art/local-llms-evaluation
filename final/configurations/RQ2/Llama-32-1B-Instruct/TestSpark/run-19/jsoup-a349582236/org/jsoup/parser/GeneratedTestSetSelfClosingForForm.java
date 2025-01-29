package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetSelfClosingForForm {

    @Test
    public void testSetSelfClosingForForm() {
        // Test case for setSelfClosing method for form tag
        TagParser tag = new TagParser();
        boolean result = tag.setSelfClosing(true);
        assertEquals(true, result);
    }

}