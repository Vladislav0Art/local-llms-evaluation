package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

public class GeneratedShouldReturnInlineTag {

    @Test
    public void shouldReturnInlineTag() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.isBlock());
    }

}