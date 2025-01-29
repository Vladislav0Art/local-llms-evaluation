package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsKnownTagWithoutName {

    @Test
    public void testIsKnownTagWithoutName() {
        Tag tag = org.jsoup.parser.Tag.valueOf("span");
        assertTrue(org.jsoup.parser.Tag.isKnownTag(tag.getName()));
    }

}