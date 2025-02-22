package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

public class GeneratedShouldNotPreserveWhitespaceInNonScriptAndStyleTags {

    @Test
    public void shouldNotPreserveWhitespaceInNonScriptAndStyleTags() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.preserveWhitespace());
        Tag spanTag = Tag.valueOf("span");
        assertFalse(spanTag.preserveWhitespace());
    }

}