package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedValueOfReturnsNewTagWhenNameIsUndefinedAndPreserveCaseIsFalse {

    @Test
    public void valueOfReturnsNewTagWhenNameIsUndefinedAndPreserveCaseIsFalse() {
        String undefinedTagName = "undefinedTag";
        Tag actualTag = Tag.valueOf(undefinedTagName, new ParseSettings());

        assertNotNull(actualTag);
        assertEquals(undefinedTagName.toLowerCase(), actualTag.getName());
    }

}