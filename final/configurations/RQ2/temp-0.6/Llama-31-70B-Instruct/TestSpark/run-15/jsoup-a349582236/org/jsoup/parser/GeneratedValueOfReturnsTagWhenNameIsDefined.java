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

public class GeneratedValueOfReturnsTagWhenNameIsDefined {

    @Test
    public void valueOfReturnsTagWhenNameIsDefined() {
        String definedTagName = "div";
        Tag actualTag = Tag.valueOf(definedTagName, new ParseSettings());

        assertNotNull(actualTag);
        assertEquals(definedTagName, actualTag.getName());
    }

}