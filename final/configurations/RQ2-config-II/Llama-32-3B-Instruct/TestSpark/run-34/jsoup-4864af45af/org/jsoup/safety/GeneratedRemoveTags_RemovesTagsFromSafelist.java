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

public class GeneratedRemoveTags_RemovesTagsFromSafelist {

    @Test
    public void removeTags_RemovesTagsFromSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        tags.add("img");
        safelist = safelist.removeTags(tags.toArray(new String[0]));
        assertFalse(safelist.isSafeTag("img"));
    }

}