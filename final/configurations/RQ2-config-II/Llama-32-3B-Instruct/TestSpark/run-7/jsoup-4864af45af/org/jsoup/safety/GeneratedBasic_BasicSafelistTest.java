package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedBasic_BasicSafelistTest {

    @Test
    public void basic_BasicSafelistTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.add("a", "img", "br", "strong");
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("script"));
    }

}