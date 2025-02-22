package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

public class GeneratedShouldPreserveWhitespaceInScriptAndStyleTags {

    @Test
    public void shouldPreserveWhitespaceInScriptAndStyleTags() {
        Tag scriptTag = Tag.valueOf("script");
        assertTrue(scriptTag.preserveWhitespace());
        Tag styleTag = Tag.valueOf("style");
        assertTrue(styleTag.preserveWhitespace());
    }

}