package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCodeReturnsSameHashCodesForEqualTags {

    @Test
    public void hashCodeReturnsSameHashCodesForEqualTags() {
        String tagName1 = "div";
        String tagName2 = "div";
        assertEquals(Tag.valueOf(tagName1).hashCode(), Tag.valueOf(tagName2).hashCode());
    }

}