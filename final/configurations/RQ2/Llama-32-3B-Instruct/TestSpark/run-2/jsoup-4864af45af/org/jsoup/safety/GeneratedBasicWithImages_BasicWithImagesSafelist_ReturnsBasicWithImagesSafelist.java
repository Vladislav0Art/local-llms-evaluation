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

public class GeneratedBasicWithImages_BasicWithImagesSafelist_ReturnsBasicWithImagesSafelist {

    @Test
    public void basicWithImages_BasicWithImagesSafelist_ReturnsBasicWithImagesSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
        assertTrue(safelist.contains("a"));
        assertTrue(safelist.contains("img"));
    }

}