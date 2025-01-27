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

public class GeneratedBasicBasicSafelist_ReturnsBasicSafelist {

    @Test
    public void basicBasicSafelist_ReturnsBasicSafelist() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
        assertTrue(safelist.contains("a"));
        assertFalse(safelist.contains("img"));
    }

}