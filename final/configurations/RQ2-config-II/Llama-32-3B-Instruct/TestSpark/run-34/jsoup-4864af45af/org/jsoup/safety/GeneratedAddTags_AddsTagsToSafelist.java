package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedAddTags_AddsTagsToSafelist {

    @Test
    public void addTags_AddsTagsToSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        tags.add("b");
        safelist = safelist.addTags(tags.toArray(new String[0]));
        assertTrue(safelist.isSafeTag("b"));
    }

}