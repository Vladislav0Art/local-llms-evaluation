package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

public class GeneratedShouldReturnBlockTag {

    @Test
    public void shouldReturnBlockTag() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

}