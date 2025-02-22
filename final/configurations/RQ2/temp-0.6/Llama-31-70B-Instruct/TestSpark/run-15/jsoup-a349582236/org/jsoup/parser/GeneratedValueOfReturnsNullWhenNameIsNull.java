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

public class GeneratedValueOfReturnsNullWhenNameIsNull {

    @Test
    public void valueOfReturnsNullWhenNameIsNull() {
        Tag actualTag = Tag.valueOf(null, new ParseSettings());
        assertNotNull(actualTag);
    }

}