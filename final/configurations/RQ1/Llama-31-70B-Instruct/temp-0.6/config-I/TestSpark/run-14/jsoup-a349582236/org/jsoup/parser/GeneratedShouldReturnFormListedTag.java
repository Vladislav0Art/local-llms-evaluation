package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.HashMap;
import java.util.Map;

public class GeneratedShouldReturnFormListedTag {

    @Test
    public void shouldReturnFormListedTag() {
        Tag inputTag = Tag.valueOf("input");
        assertTrue(inputTag.isFormListed());
        Tag selectTag = Tag.valueOf("select");
        assertTrue(selectTag.isFormListed());
    }

}