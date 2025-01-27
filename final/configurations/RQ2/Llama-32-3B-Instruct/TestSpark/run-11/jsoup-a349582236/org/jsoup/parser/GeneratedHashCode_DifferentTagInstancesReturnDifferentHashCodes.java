package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCode_DifferentTagInstancesReturnDifferentHashCodes {

    @Test
    public void hashCode_DifferentTagInstancesReturnDifferentHashCodes() {
        String tagName1 = "div";
        String tagName2 = "span";
        int hash1 = Tag.valueOf(tagName1).hashCode();
        int hash2 = Tag.valueOf(tagName2).hashCode();
        assertNotEquals(hash1, hash2);
    }

}