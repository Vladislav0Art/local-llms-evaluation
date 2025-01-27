package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEqualsDoesNotEqualTwoDifferentTags_ReturnsFalse {

    @Test
    public void equalsDoesNotEqualTwoDifferentTags_ReturnsFalse() {
        String tagName1 = "div";
        String tagName2 = "span";
        assertFalse(new Tag(tagName1).equals(new Tag(tagName2)));
    }

}