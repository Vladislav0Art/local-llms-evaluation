package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedAddTags_AddTagsToExistingSafelist_ReturnsNewSafelist {

    @Test
    public void addTags_AddTagsToExistingSafelist_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addTags("b", "strong");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("b"));
        assertTrue(newSafelist.contains("strong"));
    }

}