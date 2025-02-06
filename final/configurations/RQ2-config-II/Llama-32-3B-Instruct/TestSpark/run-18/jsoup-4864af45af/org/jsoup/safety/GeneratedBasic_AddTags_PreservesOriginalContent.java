package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.mockito.Mockito.when;

public class GeneratedBasic_AddTags_PreservesOriginalContent {

    @Test
    public void basic_AddTags_PreservesOriginalContent() {
        Element element = new Element("test");
        Set<String> tags = new HashSet<>();
        tags.add("script", "style");
        Safelist safelist = Safelist.basic();
        safelist = safelist.addTags(tags.toArray(new String[0]));
        assertEquals(Validate.equals(element, element), Validate.equals(safelist.apply(element), element));
    }

}