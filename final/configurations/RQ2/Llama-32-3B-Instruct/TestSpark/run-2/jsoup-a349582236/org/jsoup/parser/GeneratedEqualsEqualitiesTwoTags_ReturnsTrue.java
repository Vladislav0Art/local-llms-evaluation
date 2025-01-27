package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEqualsEqualitiesTwoTags_ReturnsTrue {

    @Test
    public void equalsEqualitiesTwoTags_ReturnsTrue() {
        String tagName1 = "div";
        String tagName2 = "div";
        assertTrue(new Tag(tagName1).equals(new Tag(tagName2)));
    }

}