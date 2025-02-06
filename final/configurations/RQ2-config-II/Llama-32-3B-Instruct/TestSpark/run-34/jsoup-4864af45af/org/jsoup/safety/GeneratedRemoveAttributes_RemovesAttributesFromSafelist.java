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

public class GeneratedRemoveAttributes_RemovesAttributesFromSafelist {

    @Test
    public void removeAttributes_RemovesAttributesFromSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> attributes = new HashSet<>();
        attributes.add("title");
        safelist = safelist.removeAttributes("img", attributes.toArray(new String[0]));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("title"));
    }

}