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

public class GeneratedSimpleText_SimpleTextSafelist_ReturnsSimpleTextSafelist {

    @Test
    public void simpleText_SimpleTextSafelist_ReturnsSimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertTrue(safelist.contains("text"));
    }

}