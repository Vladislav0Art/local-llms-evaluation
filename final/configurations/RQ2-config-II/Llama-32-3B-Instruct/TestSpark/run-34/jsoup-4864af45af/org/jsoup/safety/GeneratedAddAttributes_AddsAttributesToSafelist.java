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

public class GeneratedAddAttributes_AddsAttributesToSafelist {

    @Test
    public void addAttributes_AddsAttributesToSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> attributes = new HashSet<>();
        attributes.add("style");
        safelist = safelist.addAttributes("div", attributes.toArray(new String[0]));
        assertTrue(safelist.getEnforcedAttributes("div").containsKey("style"));
    }

}