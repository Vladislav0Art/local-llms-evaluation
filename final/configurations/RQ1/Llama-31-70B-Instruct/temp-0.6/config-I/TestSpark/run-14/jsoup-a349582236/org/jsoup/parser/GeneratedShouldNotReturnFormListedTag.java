package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

public class GeneratedShouldNotReturnFormListedTag {

    @Test
    public void shouldNotReturnFormListedTag() {
        Tag divTag = Tag.valueOf("div");
        assertFalse(divTag.isFormListed());
        Tag spanTag = Tag.valueOf("span");
        assertFalse(spanTag.isFormListed());
    }

}