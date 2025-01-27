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

public class GeneratedRemoveTags_RemoveTagsFromExistingSafelist_ReturnsNewSafelist {

    @Test
    public void removeTags_RemoveTagsFromExistingSafelist_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeTags("a", "img");
        assertNotNull(newSafelist);
        assertFalse(newSafelist.contains("a"));
        assertFalse(newSafelist.contains("img"));
    }

}