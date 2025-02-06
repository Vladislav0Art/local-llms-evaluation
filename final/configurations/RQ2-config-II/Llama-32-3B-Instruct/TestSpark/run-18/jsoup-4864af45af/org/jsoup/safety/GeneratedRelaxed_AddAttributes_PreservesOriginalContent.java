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

public class GeneratedRelaxed_AddAttributes_PreservesOriginalContent {

    @Test
    public void relaxed_AddAttributes_PreservesOriginalContent() {
        Element element = new Element("test");
        Set<String> tags = new HashSet<>();
        Safelist safelist = Safelist.relaxed();
        safelist = safelist.addAttributes("img", "alt", "image1");
        assertEquals(Validate.equals(element, element), Validate.equals(safelist.apply(element), element));
    }

}