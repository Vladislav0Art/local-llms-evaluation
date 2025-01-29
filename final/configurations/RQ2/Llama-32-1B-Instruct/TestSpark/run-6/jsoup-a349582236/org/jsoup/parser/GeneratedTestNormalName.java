package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        String expectedName = TAG_NAME;
        String normalName = Tag.valueOf(TAG_NAME).normalName();
        assertEquals(expectedName, normalName);
    }

}