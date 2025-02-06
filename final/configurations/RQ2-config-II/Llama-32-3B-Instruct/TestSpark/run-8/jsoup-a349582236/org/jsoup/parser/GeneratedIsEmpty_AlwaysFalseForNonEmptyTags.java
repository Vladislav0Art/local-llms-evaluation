package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.Tag;

public class GeneratedIsEmpty_AlwaysFalseForNonEmptyTags {

    @Test
    public void isEmpty_AlwaysFalseForNonEmptyTags() {
        Tag tag = new Tag("img");
        assertFalse(tag.isEmpty());
    }

}